package com.myandroidapp.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            var intent=Intent(this,Picture2Activity::class.java)
            startActivity(intent)
        }
    }
}
