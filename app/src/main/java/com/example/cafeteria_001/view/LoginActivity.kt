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

        //Chama a activity de cadastro
        button_sign_in.setOnClickListener {
            startActivity(Intent(applicationContext,SignInActivity::class.java))
        }

        //Chama a activity de login com conta google
        button_google.setOnClickListener {

        }

        //Chama a activity de login local
        button_login.setOnClickListener {
            startActivity(Intent(applicationContext,SignUpActivity::class.java))
        }

    }

    override fun onPause() {
        super.onPause()

    }
}
