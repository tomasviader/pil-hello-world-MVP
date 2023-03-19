package com.example.pil_hello_world.mvp.view

import android.widget.Toast
import com.example.pil_hello_world.activity.MainActivity
import com.example.pil_hello_world.databinding.ActivityMainBinding
import com.example.pil_hello_world.mvp.contract.MainActivityContract
import com.example.pil_hello_world.mvp.view.base.ActivityView

class MainActivityView(activity: MainActivity) : ActivityView(activity), MainActivityContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)
    init {
        activity.setContentView(binding.root)
    }

    override fun setText() {
        Toast.makeText(activity,binding.editText.text,Toast.LENGTH_SHORT).show()
    }

    override fun onButtonPressed(onClick: () -> Unit) {
        binding.changeTitleButton.setOnClickListener { onClick() }
    }

}