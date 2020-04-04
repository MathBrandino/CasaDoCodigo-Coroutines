package br.com.brandinocasadocodigo.di

import br.com.brandinocasadocodigo.network.BooksApi
import br.com.brandinocasadocodigo.network.RetrofitInitializer
import br.com.brandinocasadocodigo.repositories.BookRepository
import br.com.brandinocasadocodigo.vm.BookViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewmodels = module {

    single { RetrofitInitializer.getInstance() }
    single { BooksApi(get()) }
    single { BookRepository(get()) }
    viewModel { BookViewModel(get()) }


}