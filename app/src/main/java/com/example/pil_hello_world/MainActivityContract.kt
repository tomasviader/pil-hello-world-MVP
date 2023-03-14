package com.example.pil_hello_world

import android.widget.Toast

interface MainActivityContract {

    interface Model {
        fun getTextFromInput(message: String) : String
    }

    interface View{
        fun showText(text : String)
    }

    interface Presenter {
        fun onButtonPressed(text : String)
    }

}