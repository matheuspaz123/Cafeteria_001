package com.example.cafeteria_001.model.remote

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class CepRetrofit private constructor() {

    /*Criando singleton para não instanciar varios retrofit, eles serão instanciados
    *já prontos com a interface de serviço
     */

    companion object {

        private fun getRetrofit(): Retrofit {

            //Criando uma variavel que gera os dados do retrofit
            val retrofit = Retrofit.Builder()
                .baseUrl("http://viacep.com.br/ws/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
        //Instanciar o retrofit passando a interface de serviço
        fun createServiceCep(service: Class<CepService>): CepService {
            return getRetrofit().create(service)
        }
    }
}