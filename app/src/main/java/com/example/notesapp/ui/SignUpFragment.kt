package com.example.notesapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.notesapp.R

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        view.findViewById<Button>(R.id.signup_button).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_notesFragment)
        }
        return view


    }

}