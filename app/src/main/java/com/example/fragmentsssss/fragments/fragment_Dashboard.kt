package com.example.fragmentsssss.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fragmentsssss.R
class fragment_Dashboard : Fragment(R.layout.fragment__dashboard){
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText=view.findViewById(R.id.editTextTextPersonName)
        button=view.findViewById(R.id.button)

        button.setOnClickListener {
            var name=editText.text.toString()
            var action=fragment_DashboardDirections.actionFragmentDashboardToFragmentNotification(name)
            findNavController().navigate(action)



        }


    }
}