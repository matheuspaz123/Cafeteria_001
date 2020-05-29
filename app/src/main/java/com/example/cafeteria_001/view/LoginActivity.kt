package com.example.cafeteria_001.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeteria_001.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private var validator = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        button_sign_in.setOnClickListener {
            startActivity(Intent(applicationContext,SignInActivity::class.java))
        }
        button_google.setOnClickListener {

        }
        button_login.setOnClickListener {
            startActivity(Intent(applicationContext,SignUpActivity::class.java))
        }

    }

    override fun onPause() {
        super.onPause()

    }
}
