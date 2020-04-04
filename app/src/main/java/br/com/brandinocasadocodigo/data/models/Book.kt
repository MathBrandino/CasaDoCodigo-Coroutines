package br.com.brandinocasadocodigo.data.models

import com.squareup.moshi.Json

data class Book(
    val id: Int,
    val isbn: String,
    @field:Json(name = "nomeLivro") val name: String,
    @field:Json(name = "imagemUrl") val image: String,
    @field:Json(name = "dataPublicacao") val publishDate: String,
    @field:Json(name = "numeroPaginas") val pages: Int,
    @field:Json(name = "valorVirtualComFisico") val comboPrice: Double,
    @field:Json(name = "valorVirtual") val ebookPrice: Double,
    @field:Json(name = "valorFisico") val price: Double
)