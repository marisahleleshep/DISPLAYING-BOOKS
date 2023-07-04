package com.example.displayingbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import booksRVAdapter
import com.example.displayingbooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayBooks()

    }

    fun displayBooks(){
        var book1=booksData("https://media.istockphoto.com/id/1381221247/photo/beautiful-afro-girl-with-curly-hairstyle.webp?b=1&s=170667a&w=0&k=20&c=0x91osZOkL8EfhTEEGNa2EeCGN2gdMTNULOsUFW_0i4=","Born A Crime","Trevor Noah",2009)
        var book2=booksData("https://images.unsplash.com/photo-1522075469751-3a6694fb2f61?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8cHJvZmlsZSUyMGltYWdlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Little Did I know","Trevor Noah",2009)
        var book3=booksData("https://www.istockphoto.com/photo/portrait-of-black-business-woman-at-rooftop-in-berlin-gm1320289910-406899274?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_bottom&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fprofile-images-for-a-black-person&utm_term=profile%20images%20for%20a%20black%20person%3A%3A%3A","Desire Pursuit","Trevor Noah",2009)
        var book4=booksData("https://www.istockphoto.com/photo/portrait-of-black-business-woman-at-rooftop-in-berlin-gm1320289910-406899274?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_bottom&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fprofile-images-for-a-black-person&utm_term=profile%20images%20for%20a%20black%20person%3A%3A%3A","Born A Crime","Trevor Noah",2009)
        var book5=booksData("https://www.istockphoto.com/photo/portrait-of-black-business-woman-at-rooftop-in-berlin-gm1320289910-406899274?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_bottom&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fprofile-images-for-a-black-person&utm_term=profile%20images%20for%20a%20black%20person%3A%3A%3A","Born A Crime","Trevor Noah",2009)
        var book6=booksData("https://www.istockphoto.com/photo/young-man-in-his-20s-with-great-smile-gm174658064-8655619","Born A Crime","Trevor Noah",2009)
        var book7=booksData("https://www.istockphoto.com/photo/african-man-holding-hands-near-mouth-whispering-looking-at-camera-gm1152782343-312874207","Born A Crime","Trevor Noah",2009)
        var book8=booksData("https://www.istockphoto.com/photo/african-man-holding-hands-near-mouth-whispering-looking-at-camera-gm1152782343-312874207","Desire Pursuit","Trevor Noah",2009)
        var book9=booksData("https://www.istockphoto.com/photo/african-man-holding-hands-near-mouth-whispering-looking-at-camera-gm1152782343-312874207","Desire Pursuit","Trevor Noah",2009)
        var book10=booksData("https://www.istockphoto.com/photo/african-man-holding-hands-near-mouth-whispering-looking-at-camera-gm1152782343-312874207","Little Did I know","Trevor Noah",2009)

    var booklist= listOf<booksData>(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10)
        binding.rvbooks.layoutManager=LinearLayoutManager(this)
        var bookAdapter=booksRVAdapter(booklist)
        binding.rvbooks.adapter=bookAdapter
    }

}