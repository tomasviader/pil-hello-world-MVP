package com.example.pil_hello_world

import android.widget.Toast

class MainActivityPresenter(private val mainView : MainActivityContract.View,
                            private val mainModel : MainActivityContract.Model) : MainActivityContract.Presenter{

    override fun onButtonPressed(message : String)  {
        var inputText = mainModel.getTextFromInput(message)
        mainView.showText(inputText)
    }


}