package com.example.uidesignproject

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uidesignproject.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity()
{
    private lateinit var binding : ActivityRegistrationBinding
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding =ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.checkBoxAgree.addOnCheckedStateChangedListener { checkBox, state ->
            if(checkBox.isChecked){
                checkBox.text ="Do you agree"
            }else{
                checkBox.text = "I agree"
            }
        }

    }
}