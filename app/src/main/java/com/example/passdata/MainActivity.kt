package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt = findViewById<TextView>(R.id.nameEt);
        val emailEt  = findViewById<TextView>(R.id.emailEt);
        val phoneEt = findViewById<TextView>(R.id.phoneEt);
        val saveEt = findViewById<TextView>(R.id.savebtn);

        saveEt.setOnClickListener {
            var name = nameEt.text.toString();
            var email = emailEt.text.toString();
            var phone = phoneEt.text.toString();

            intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            intent.putExtra("Phone", phone )
             startActivity(intent)
        }
    }
}