package com.example.cafeteria_001.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeteria_001.R

class SignUpActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide()

    }
}