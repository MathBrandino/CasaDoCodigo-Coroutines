package br.com.brandinocasadocodigo.network

import br.com.brandinocasadocodigo.data.models.Book
import retrofit2.Retrofit

class BooksApi(retrofit: Retrofit) {

    private val service: BooksService by lazy {
        retrofit.create(BooksService::class.java)
    }

    suspend fun getBooks(): List<Book> {

        val booksResponse = service.getBooks()

        return booksResponse.books
    }

}