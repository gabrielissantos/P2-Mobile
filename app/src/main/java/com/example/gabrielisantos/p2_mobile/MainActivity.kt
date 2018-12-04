package com.example.gabrielisantos.p2_mobile

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a1 = Article(
                idDrink = "13060",
                strDrink = "Margarita",
                strDrinkES = null,
                strDrinkDE = null,
                strDrinkFR = null,
                strDrinkZH_HANS = null,
                strDrinkZH_HANT = null,
                strVideo = null,
                strCategory = "Ordinary Drink",
                strIBA = "Contemporary Classics",
                strAlcoholic = "Alcoholic",
                strGlass = "Cocktail glass",
                strInstructions = "Rub the rim of the glass with the lime slice to make the salt stick to it. Take care to moisten only the outer rim and sprinkle the salt on it. The salt should present to the lips of the imbiber and never mix into the cocktail. Shake the other ingredients with ice, then carefully pour into the glass.",
                strInstructionsES = null,
                strInstructionsDE = null,
                strInstructionsFR = null,
                strInstructionsZH_HANS = null,
                strInstructionsZH_HANT = null,
                strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/wpxpvu1439905379.jpg",
                strIngredient1 = "Tequila",
                strIngredient2 = "Triple sec",
                strIngredient3 = "Lime juice",
                strIngredient4 = "Salt",
                strIngredient5 = "",
                strIngredient6 = "",
                strIngredient7 = "",
                strIngredient8 = "",
                strIngredient9 = "",
                strIngredient10 = "",
                strIngredient11 = "",
                strIngredient12 = "",
                strIngredient13 = "",
                strIngredient14 = "",
                strIngredient15 = "",
                strMeasure1 = "1 1/2 oz ",
                strMeasure2 = "1/2 oz ",
                strMeasure3 = "1 oz ",
                strMeasure4 = "",
                strMeasure5 = "",
                strMeasure6 = "",
                strMeasure7 = "",
                strMeasure8 = "",
                strMeasure9 = "",
                strMeasure10 = "",
                strMeasure11 = "",
                strMeasure12 = "",
                strMeasure13 = "",
                strMeasure14 = "",
                strMeasure15 = "",
                dateModified = "2015-08-18 14:42:59"
        )

        val a2 = Article (
                idDrink = "11118",
                strDrink = "Blue Margarita",
                strDrinkES = null,
                strDrinkDE = null,
                strDrinkFR = null,
                strDrinkZH_HANS = null,
                strDrinkZH_HANT = null,
                strVideo = null,
                strCategory = "Ordinary Drink",
                strIBA = null,
                strAlcoholic = "Alcoholic",
                strGlass = "Cocktail glass",
                strInstructions = "Rub rim of cocktail glass with lime juice. Dip rim in coarse salt. Shake tequila, blue curacao, and lime juice with ice, strain into the salt-rimmed glass, and serve.",
                strInstructionsES = null,
                strInstructionsDE = null,
                strInstructionsFR = null,
                strInstructionsZH_HANS = null,
                strInstructionsZH_HANT = null,
                strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/qtvvyq1439905913.jpg",
                strIngredient1 = "Tequila",
                strIngredient2 = "Blue Curacao",
                strIngredient3 = "Lime juice",
                strIngredient4 = "Salt",
                strIngredient5 = "",
                strIngredient6 = "",
                strIngredient7 = "",
                strIngredient8 = "",
                strIngredient9 = "",
                strIngredient10 = "",
                strIngredient11 = "",
                strIngredient12 = "",
                strIngredient13 = "",
                strIngredient14 = "",
                strIngredient15 = "",
                strMeasure1 = "1 1/2 oz ",
                strMeasure2 = "1 oz ",
                strMeasure3 = "1 oz ",
                strMeasure4 = "Coarse ",
                strMeasure5 = " ",
                strMeasure6 = " ",
                strMeasure7 = " ",
                strMeasure8 = " ",
                strMeasure9 = " ",
                strMeasure10 = "",
                strMeasure11 = "",
                strMeasure12 = "",
                strMeasure13 = "",
                strMeasure14 = "",
                strMeasure15 = "",
                dateModified = "2015-08-18 14:51:53"
        )

        val testList = listOf(a1,a2)

        exibeLista(testList)
    }

    fun exibeLista(list: List<Article>){
        val adapter = ArticleAdapter(this, list)
        adapter.setOnItemClickListener{position ->
            val openBrowser = Intent(Intent.ACTION_VIEW)
            openBrowser.data = Uri.parse(list.get(position).strDrinkThumb)
            startActivity(openBrowser)
        }
        rvCocktail.adapter = adapter
        rvCocktail.layoutManager = LinearLayoutManager(this)
    }
}
