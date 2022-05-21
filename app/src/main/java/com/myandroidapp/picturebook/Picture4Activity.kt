package com.myandroidapp.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture4Activity : AppCompatActivity() {
    lateinit var btnPreview4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        btnPreview4=findViewById(R.id.btnPreview4)
        btnNext4=findViewById(R.id.btnNext4)
        btnPreview4.setOnClickListener {
            var intent=Intent(this,Picture3Activity::class.java)
            startActivity(intent)

        }
        btnNext4.setOnClickListener {
            var intent=Intent(this,Picture5Activiyt::class.java)
            startActivity(intent)
        }
    }
}