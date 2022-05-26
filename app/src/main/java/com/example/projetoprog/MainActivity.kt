package com.example.projetoprog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<TextView>(R.id.username)
        var password = findViewById<TextView>(R.id.password)
        var loginbtn =findViewById<MaterialButton>(R.id.loginbtn)



        //admin an admin

        loginbtn.setOnClickListener() {
            fun onClick() {
                if (username.getText().toString().equals("admin") && password.getText().toString()
                        .equals("admin")
                ) {
                    //correct
                    //incorrect
                }
            }

        }

    }

}