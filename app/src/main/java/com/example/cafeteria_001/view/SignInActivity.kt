package com.example.cafeteria_001.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeteria_001.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        button_login_local.setOnClickListener {
            startActivity(Intent(applicationContext, ProductMenuActivity::class.java))
        }
    }
}
