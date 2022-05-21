package com.myandroidapp.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture5Activiyt : AppCompatActivity() {
    lateinit var btnPreview5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture5_activiyt)
        btnPreview5=findViewById(R.id.btnPreview5)
        btnPreview5.setOnClickListener {
            var intent=Intent(this,Picture4Activity::class.java)
            startActivity(intent)
        }

    }
}