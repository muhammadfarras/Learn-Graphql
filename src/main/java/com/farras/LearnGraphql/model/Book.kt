package com.farras.LearnGraphql.model

import java.util.*

data class Book(var id:Int,
           var name:String,
           var pageCount:Int){



    companion object {
        val books = Arrays.asList(
            Book(1,"Al Quran",656)
        )
    }
}
