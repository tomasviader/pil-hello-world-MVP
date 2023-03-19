package com.example.pil_hello_world.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pil_hello_world.mvp.presenter.MainActivityPresenter
import com.example.pil_hello_world.mvp.view.MainActivityView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityPresenter(MainActivityView(this))

    }

}