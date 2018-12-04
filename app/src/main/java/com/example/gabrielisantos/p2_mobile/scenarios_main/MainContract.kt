package com.example.gabrielisantos.p2_mobile.scenarios_main

import com.example.gabrielisantos.p2_mobile.entities.Article

interface MainContract {
    interface View{
        fun showMessage(msg: String)
        fun showList(articles: List<Article>)

    }

    interface Presenter{
        fun onLoadList()
    }
}