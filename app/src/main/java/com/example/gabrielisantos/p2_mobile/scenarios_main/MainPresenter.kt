package com.example.gabrielisantos.p2_mobile.scenarios_main

import com.example.gabrielisantos.p2_mobile.entities.ArticleList
import com.example.gabrielisantos.p2_mobile.network.RetrofitInicializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val view: MainContract.View): MainContract.Presenter {

    override fun onLoadList(){

        val cocktailService = RetrofitInicializer().createCocktailService()

        val call = cocktailService.getTopHeadLines()

        call.enqueue(object : Callback<ArticleList> {
            override fun onFailure(call: Call<ArticleList>?, t: Throwable?) {
                view.showMessage("Falha na conexão. Verifique o acesso à internet")
            }

            override fun onResponse(call: Call<ArticleList>?, response: Response<ArticleList>) {
                if(response.body() != null){
                    view.showList(response.body()!!.articles)
                }
                else{
                    view.showMessage("Sem drinks para hoje")
                }
            }
        })
    }
}
