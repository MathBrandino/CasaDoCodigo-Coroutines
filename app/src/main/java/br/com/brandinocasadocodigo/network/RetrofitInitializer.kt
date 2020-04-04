package br.com.brandinocasadocodigo.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://cdcmob.herokuapp.com/")
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(MoshiConverterFactory.create())
        .build()


    fun getInstance() = retrofit
}