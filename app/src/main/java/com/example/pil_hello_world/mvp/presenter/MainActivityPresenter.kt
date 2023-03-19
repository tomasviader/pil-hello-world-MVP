package com.example.pil_hello_world.mvp.presenter

import com.example.pil_hello_world.mvp.contract.MainActivityContract

class MainActivityPresenter(private val mainView : MainActivityContract.View) :
    MainActivityContract.Presenter {

    init {
        mainView.onButtonPressed { onButtonPressed() }
    }

    override fun onButtonPressed()  {
        mainView.setText()
    }

}