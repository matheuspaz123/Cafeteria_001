package com.example.cafeteria_001.model.remote

import com.google.gson.annotations.SerializedName

class CepModel {

    @SerializedName("logradouro")
    var logradouro: String = ""

    @SerializedName("bairro")
    var bairro: String = ""

    @SerializedName("localidade")
    var localidade: String = ""

    @SerializedName("uf")
    var uf: String = ""

    @SerializedName("cep")
    var cep: String = ""

    @SerializedName("complemento")
    var complemento: String = ""

    @SerializedName("gia")
    var gia: String = ""

    @SerializedName("ibge")
    var ibge: String = ""

    @SerializedName("unidade")
    var unidade: String = ""



}