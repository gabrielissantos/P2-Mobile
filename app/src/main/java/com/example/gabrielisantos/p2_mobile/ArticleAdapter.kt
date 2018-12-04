package com.example.gabrielisantos.p2_mobile

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.gabrielisantos.p2_mobile.R
//import com.example.gabrielisantos.p2_mobile.entities.Article
import com.example.gabrielisantos.p2_mobile.MyAppGlideModule
import kotlinx.android.synthetic.main.activity_cocktail_item.view.*

class ArticleAdapter(val context: Context, val articles: List<Article>) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    var itemClickListener: ((index: Int) -> Unit)? = null

    fun setOnItemClickListener(clique: ((index: Int) -> Unit)){
        this.itemClickListener = clique
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_cocktail_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.bindView(context, articles[position], itemClickListener)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindView(context: Context, article: Article, itemClickListener: ((index: Int) -> Unit)?){
            itemView.tvDrink.text = article.strDrink

            GlideApp.with(context)
                    .load(article.strDrink)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .centerCrop()
                    .into(itemView.imgFoto)

            if(itemClickListener != null){
                itemView.setOnClickListener(){
                    itemClickListener.invoke(adapterPosition)
                }
            }
        }
    }
}