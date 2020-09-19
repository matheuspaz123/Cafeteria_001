package com.example.cafeteria_001.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cafeteria_001.R
import com.example.cafeteria_001.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)


        //Chama a activity de cadastro
        button_sign_in.setOnClickListener{
            findNavController().navigate(R.id.signInActivity)
        }

        //Chama a activity de login com conta google
        button_google.setOnClickListener {

        }

        //Chama a activity de login local
        button_login.setOnClickListener {
        findNavController().navigate(R.id.signUpActivity)
        }

    }
        // TODO: Use the ViewModel
    }

