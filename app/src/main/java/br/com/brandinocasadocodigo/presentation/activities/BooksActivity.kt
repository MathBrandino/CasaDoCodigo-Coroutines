package br.com.brandinocasadocodigo.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.brandinocasadocodigo.R
import br.com.brandinocasadocodigo.presentation.fragments.BooksFragment
import br.com.brandinocasadocodigo.vm.BookViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class BooksActivity : AppCompatActivity() {

    private val bookViewModel: BookViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bookViewModel.searchBooks()

        bookViewModel.books().observe(this, Observer { books ->
            books?.let {
                show(BooksFragment.with(books))
            }
        })

        bookViewModel.error().observe(this, Observer { error ->
            error?.let {
                AlertDialog.Builder(this).setMessage(error.message).show()
            }
        })
    }

    private fun show(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }
}
