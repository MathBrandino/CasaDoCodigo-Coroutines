package br.com.brandinocasadocodigo.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.brandinocasadocodigo.data.models.Book
import br.com.brandinocasadocodigo.databinding.BookItemBinding

class BooksAdapter(private val books: List<Book>) : RecyclerView.Adapter<BooksAdapter.BookViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val itemBinding = BookItemBinding.inflate(inflater, parent, false)

        return BookViewHolder(itemBinding)

    }

    override fun getItemCount(): Int = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {

        holder.bind(books[position])
    }


    class BookViewHolder(private val binding: BookItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(book: Book) {
            binding.book = book
        }
    }
}
