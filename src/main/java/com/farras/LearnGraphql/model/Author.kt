package com.farras.LearnGraphql.model

import java.util.*

data class Author(var id:Int, var name:String, var placeBirth:String, var dateBirth:String){

    companion object {
        val authors = Arrays.asList(
            Author(1,"Allah Azza Waa Jalla","Unknown","Unknown"),
            Author(2,"Muhammad Farras Ma'ruf","Jakarta","1995-12-27"),
            Author(3,"Rumaisha Hilyah Ma'ruf","Unknown","2023-12-15")
        )

        fun authorByBook(book:Book):Author?{
            return authors.stream().filter { it -> it.id == book.id }
                .findFirst()
                .orElse(null)
        }
    }
}
