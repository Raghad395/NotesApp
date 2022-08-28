package com.example.notesapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.notesapp.R
import com.example.notesapp.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.login_button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_loginFragment)
        }

        view.signup_button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_signUpFragment)
        }
        return view
    }
}