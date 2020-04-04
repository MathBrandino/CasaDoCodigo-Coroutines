package br.com.brandinocasadocodigo.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.brandinocasadocodigo.R
import br.com.brandinocasadocodigo.data.models.Book
import br.com.brandinocasadocodigo.presentation.adapters.BooksAdapter
import kotlinx.android.synthetic.main.books_fragment.view.*

class BooksFragment : Fragment() {

    private lateinit var books: List<Book>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.books_fragment, container, false)

        view.books.adapter = BooksAdapter(books)
        view.books.layoutManager = LinearLayoutManager(context)

        return view

    }


    companion object {
        fun with(books: List<Book>): BooksFragment {
            val instance = BooksFragment()
            instance.books = books
            return instance

        }
    }
}