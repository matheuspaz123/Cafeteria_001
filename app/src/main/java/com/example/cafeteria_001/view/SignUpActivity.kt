package com.example.cafeteria_001.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cafeteria_001.R
import com.example.cafeteria_001.model.remote.CepModel
import com.example.cafeteria_001.model.remote.CepRetrofit
import com.example.cafeteria_001.model.remote.CepService
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        button_sign_up.setOnClickListener {
            var cep = text_sign_up_cep.text.toString()

            if (cep != "") {
                //Instanciei o retrofit com a interface passada como referencia
                val cepRetrofit = CepRetrofit.createServiceCep(CepService::class.java)
                var call: Call<CepModel> = cepRetrofit.getCEP(cep)

                val response = call.enqueue(object : Callback<CepModel>{
                    override fun onFailure(call: Call<CepModel>, t: Throwable) {
                        //não conseguiu comunicar
                        Toast.makeText(applicationContext, "$t", Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<CepModel>, response: Response<CepModel>) {
                        val teste = response.body()
                        Toast.makeText(applicationContext, "$response", Toast.LENGTH_LONG).show()
                    }

                })
            }

        }

    }
}
