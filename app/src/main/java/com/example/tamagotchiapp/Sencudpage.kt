package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Sencudpage : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView

    private var button1ClickCount = 0
    private var button2ClickCount = 0
    private var button3ClickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sencudpage)

        imageView = findViewById(R.id.imageView)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textView4)

        button1.setOnClickListener {
            button1ClickCount++
            textView2.text = button1ClickCount.toString()
            imageView.setImageResource(R.drawable.photto)
        }

        button2.setOnClickListener {
            button2ClickCount++
            textView3.text = button2ClickCount.toString()
            imageView.setImageResource(R.drawable.image)
        }

        button3.setOnClickListener {
            button3ClickCount++
            textView4.text = button3ClickCount.toString()
            imageView.setImageResource(R.drawable.picture)
        }
    }
}
