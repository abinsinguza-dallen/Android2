package com.myandroidapp.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Picture2Activity : AppCompatActivity() {
    lateinit var btnPreview2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        btnPreview2=findViewById(R.id.btnPreview2)
        btnNext2=findViewById(R.id.btnNext2)
        btnPreview2.setOnClickListener {
            var intent=Intent(this,Picture3Activity::class.java)
            startActivity(intent)
        }
        var intent=Intent(this,Picture3Activity::class.java)
        startActivity(intent)
    }
}