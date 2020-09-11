package com.example.cafeteria_001.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.cafeteria_001.R
import com.example.cafeteria_001.model.remote.CepModel
import com.example.cafeteria_001.model.remote.CepRetrofit
import com.example.cafeteria_001.model.remote.CepService
import com.example.cafeteria_001.viewmodel.SignUpViewModel
import kotlinx.android.synthetic.main.sign_up_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpFragment : Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_up_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)


        var call: Call<CepModel>? = null
        //botão para obter endereço pelo CEP
        button_sign_up_atualization.setOnClickListener {
            bindCep()
        }
        // TODO: Use the ViewModel
    }



    //faz a busca e o binding dos dados com as views
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
                    text_view_sign_up_bairro.text = aux?.bairro
                }
            })
        }else{
            //Toast.makeText(this,"Cep invalido", Toast.LENGTH_LONG).show()
        }
    }


}