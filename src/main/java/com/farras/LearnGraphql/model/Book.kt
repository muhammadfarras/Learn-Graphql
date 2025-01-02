package com.farras.LearnGraphql.model

import java.util.*

data class Book(var id:Int,
           var name:String,
           var pageCount:Int){



    companion object {
        val books = Arrays.asList(
            Book(1,"Al Quran",656),
            Book(2,"Pytorch",450),
            Book(3,"Machine Learning using TensorFlow",752)
        )
    }
}
