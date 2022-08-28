package com.example.notesapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.notesapp.R
import kotlinx.android.synthetic.main.fragment_login.*
import android.widget.Toast.makeText as makeText1

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        view.findViewById<Button>(R.id.login_button).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_notesFragment)
        }
        return view


        }
}

