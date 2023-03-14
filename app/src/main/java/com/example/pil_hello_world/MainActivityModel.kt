package com.example.pil_hello_world

import android.widget.Toast
import com.example.pil_hello_world.databinding.ActivityMainBinding

class MainActivityModel : MainActivityContract.Model {


    override fun getTextFromInput(text : String) : String {
        return "The message is: " + text
    }


}