package com.farras.LearnGraphql.controllers

import com.farras.LearnGraphql.model.Author
import com.farras.LearnGraphql.model.Book
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller


@Controller
class BookController {

    @QueryMapping
    fun books():List<Book>{
        println("Called")
        return  Book.books
    }


    @SchemaMapping(typeName = "Query", field = "bookById")
    fun getBookById(@Argument id:Int):Book?{
        println("Called ${id}")
        return Book.booksById(id)
    }

    @SchemaMapping(typeName = "Book", field = "author")
    fun author(book: Book):Author?{
        println("Author of : ${book.name}")
        return Author.authorByBook(book)
    }
}