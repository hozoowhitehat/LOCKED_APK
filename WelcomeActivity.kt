package com.example.pinunlockapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Menghubungkan komponen UI
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val imageView = findViewById<ImageView>(R.id.imageView)

        // URL gambar yang ingin ditampilkan
        val imageUrl = "https://i.ibb.co/1Gx6xy5q/New-Project-64-7-F3-FEB1.png"

        // Menampilkan gambar menggunakan Picasso
        Picasso.get().load(imageUrl).into(imageView)
    }
}
