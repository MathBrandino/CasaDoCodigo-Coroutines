package br.com.brandinocasadocodigo.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.brandinocasadocodigo.data.models.Book
import br.com.brandinocasadocodigo.repositories.BookRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookViewModel(private val repository: BookRepository) : ViewModel() {


    private val booksLiveData = MutableLiveData<List<Book>>()
    private val errorLiveData = MutableLiveData<Exception>()

    fun books() = booksLiveData as LiveData<List<Book>>
    fun error() = errorLiveData as LiveData<Exception>

    fun searchBooks() {

        CoroutineScope(context = Dispatchers.IO).launch {
            try {
                val books = repository.getBooks()

                launch(Dispatchers.Main) {
                    booksLiveData.postValue(books)
                }
            } catch (e: Exception) {
                launch(Dispatchers.Main) {
                    errorLiveData.postValue(e)
                }
            }

        }
    }

}