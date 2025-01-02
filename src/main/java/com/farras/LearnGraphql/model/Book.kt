package com.farras.LearnGraphql.model

import java.util.*

data class Book(
    var id: Int,
    var name: String,
    var pageCount: Int,
    var author: Int
) {

    companion object {
        val books = Arrays.asList(
            Book(1, "Al Quran", 656,1),
            Book(2, "Pytorch", 450,2),
            Book(3, "Machine Learning using TensorFlow", 752,3)
        )

        fun booksById(idBook: Int): Book? {
            return books.stream().filter { it.id == idBook }
                .findFirst()
                .orElse(null)

        }
    }
}
