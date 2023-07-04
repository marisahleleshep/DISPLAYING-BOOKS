import com.example.displayingbooks.booksData

//apackage com.example.displayingbooks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.displayingbooks.databinding.BookMainListBinding
import com.squareup.picasso.Picasso

class booksRVAdapter(var bookList: List<booksData>):RecyclerView.Adapter<booksViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): booksViewHolder {
        var binding=BookMainListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return booksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: booksViewHolder, position: Int) {
        var book=bookList[position]
        holder.binding.apply{
            tvTitle.text=book.BookTitle
            tvAuthor.text=book.AuthorName
            tvYear.text=book.Publication.toString()
            Picasso.get().load(book.avatar).into(bindig.ivBooks)
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

}

class booksViewHolder(var binding: BookMainListBinding):RecyclerView.ViewHolder(binding.root){

}


