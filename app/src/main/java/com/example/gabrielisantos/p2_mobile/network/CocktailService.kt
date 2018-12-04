package com.example.gabrielisantos.p2_mobile.network

import android.telecom.Call
import com.example.gabrielisantos.p2_mobile.entities.ArticleList
import retrofit2.Callback
import retrofit2.http.GET

interface CocktailService {

    companion object {
        private const val API_KEY = "s=margarita"/*""*/
    }
    @GET("search.php?&$API_KEY") /*search.php?*/
    fun getTopHeadLines(): Callback<ArticleList>
}