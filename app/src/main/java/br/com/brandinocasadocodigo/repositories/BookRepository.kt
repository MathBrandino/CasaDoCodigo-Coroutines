package br.com.brandinocasadocodigo.repositories

import br.com.brandinocasadocodigo.network.BooksApi

class BookRepository(private val api: BooksApi) {

    suspend fun getBooks() = api.getBooks()

}