package com.example.pil_hello_world.mvp.contract

import android.widget.Toast

interface MainActivityContract {
    interface View{
        fun setText()
        fun onButtonPressed(onClick : () -> Unit)
    }

    interface Presenter {
        fun onButtonPressed()
    }

}