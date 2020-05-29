package com.example.cafeteria_001.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.cafeteria_001.R
import kotlinx.coroutines.delay

//tela de apresentação
class SplashActivity : AppCompatActivity() {

    private var validator = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()


        /*Se colocar o Handle quando esta criando não da tempo de baixar a fonte do texto
        *por isso coloco na onStart, pois lá ja baixou ela.
        */

        // Handler().postDelayed({startActivity(Intent(applicationContext, LoginActivity::class.java))},6000)

    }

    override fun onStart() {
        super.onStart()

        /*Verificação para ver se a activity já foi criada, para caso o usuario
        *clique no botão de voltar ela não volte para a splash, mas finaliza a splash
         */
        if (validator == 0) {
            Handler().postDelayed({
                startActivity(Intent(applicationContext, LoginActivity::class.java))
            }, 4000)

            validator = 1

        }else{
            //Se o usuario clicar para voltar, a tela não volta para esta, ela finaliza
            finish()
        }
    }


}
