package com.example.cafeteria_001.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.cafeteria_001.R
import com.example.cafeteria_001.model.remote.CepModel
import com.example.cafeteria_001.model.remote.CepRetrofit
import com.example.cafeteria_001.model.remote.CepService
import com.example.cafeteria_001.viewmodel.SignUpViewModel
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SignUpActivity : AppCompatActivity() {

    var call: Call<CepModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val mViewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)

        button_sign_up_atualization.setOnClickListener {
            bindCep()
        }
    }

    fun bindCep() {
        val cep = text_sign_up_cep.text.toString()
        if (cep.length == 8) {
            val cepRetrofit = CepRetrofit.createServiceCep(CepService::class.java)
            var call: Call<CepModel> = cepRetrofit.getCEP(cep)

            val response = call.enqueue(object : Callback<CepModel> {
                override fun onFailure(call: Call<CepModel>, t: Throwable) {

                }

                override fun onResponse(call: Call<CepModel>, response: Response<CepModel>) {
                    val aux = response.body()
                    text_view_sign_up_localidade.text = aux?.localidade
                    text_view_sign_up_uf.text = aux?.uf
                    text_view_sign_up_logradouro.text = aux?.logradouro
                }
            })
        }else{
            Toast.makeText(applicationContext,"Cep invalido", Toast.LENGTH_LONG).show()
        }
    }

}