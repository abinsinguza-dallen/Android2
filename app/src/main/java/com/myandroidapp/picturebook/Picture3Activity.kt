package com.myandroidapp.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture3Activity : AppCompatActivity() {
    lateinit var btnPreview3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        btnPreview3=findViewById(R.id.btnPreview3)
        btnNext3=findViewById(R.id.btnNext3)

        btnPreview3.setOnClickListener {

        }
    }
}