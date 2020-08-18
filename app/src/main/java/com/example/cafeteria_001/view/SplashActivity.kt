package com.example.cafeteria_001.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeteria_001.R

//tela de apresentação
class SplashActivity : AppCompatActivity() {

    private var validator = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
    }


}
