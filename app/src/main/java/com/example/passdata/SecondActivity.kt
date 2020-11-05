package com.example.passdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent  = intent
        val  name = intent.getStringExtra("Name")
        val  email = intent.getStringExtra("Email")
        val  phone  = intent.getStringExtra("Phone")

        val resultEt = findViewById<TextView>(R.id.Resulttv);
            resultEt.text = "Name:"+name+"\nEmail:"+email+"\nPhone"+phone







    }
}