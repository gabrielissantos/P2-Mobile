package com.example.gabrielisantos.p2_mobile.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInicializer {
    val retrofit = Retrofit.Builder()
            .baseUrl("https://www.thecocktaildb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun createCocktailService(): CocktailService{
        return retrofit.create(CocktailService::class.java)
    }
}