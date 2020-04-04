package br.com.brandinocasadocodigo.network

import br.com.brandinocasadocodigo.network.responses.BooksResponse
import retrofit2.http.GET

interface BooksService {

    @GET("listarLivros?indicePrimeiroLivro=0&qtdLivros=20")
    suspend fun getBooks() : BooksResponse
}