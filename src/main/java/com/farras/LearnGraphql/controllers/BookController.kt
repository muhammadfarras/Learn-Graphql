package com.farras.LearnGraphql.controllers

import com.farras.LearnGraphql.model.Book
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class BookController {

    @QueryMapping
    fun books():List<Book>{
        return  Book.books
    }
}