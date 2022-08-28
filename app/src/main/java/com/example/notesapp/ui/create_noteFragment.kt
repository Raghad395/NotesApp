package com.example.notesapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.notesapp.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_create_note.*
import java.text.SimpleDateFormat
import java.util.*


class create_noteFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val date = SimpleDateFormat("dd/M/yyy hh:mm:ss")
        val currentDate = date.format(Date())

        datetext.text = currentDate
        imgDone.setOnClickListener{
            //saveNote
            saveNote()
        }
        imgBacke.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_create_noteFragment_to_notesFragment)

        }
    }

    private fun saveNote() {
        if (notes_title.text.isNullOrEmpty()){
            Toast.makeText(context,"Note Title is Require", Toast.LENGTH_SHORT).show()
        }
        if (notes_subtitle.text.isNullOrEmpty()){
            Toast.makeText(context,"Note Sub Title is Require", Toast.LENGTH_SHORT).show()
        }
        if (notes_dec.text.isNullOrEmpty()){
            Toast.makeText(context,"Notes Context Empty!", Toast.LENGTH_SHORT).show()
        }
    }

}
