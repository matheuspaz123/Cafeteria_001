package com.example.cafeteria_001.model.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface CepService {

    /*
    Json retorno exemplo
    {
      "cep": "01001-000",
      "logradouro": "Praça da Sé",
      "complemento": "lado ímpar",
      "bairro": "Sé",
      "localidade": "São Paulo",
      "uf": "SP",
      "unidade": "",
      "ibge": "3550308",
      "gia": "1004"
    }
     */

    @GET("{cep}/json/")
    fun getCEP(@Path("cep") cep: String): Call<CepModel>

}