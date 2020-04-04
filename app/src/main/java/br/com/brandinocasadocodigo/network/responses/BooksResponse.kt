package br.com.brandinocasadocodigo.network.responses

import br.com.brandinocasadocodigo.data.models.Book
import com.squareup.moshi.Json

class BooksResponse(@field:Json(name = "livros")  val books: List<Book>)