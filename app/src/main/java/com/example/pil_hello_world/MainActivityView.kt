package com.example.pil_hello_world

import android.widget.Toast
import com.example.pil_hello_world.databinding.ActivityMainBinding

class MainActivityView(activity: MainActivity) : ActivityView(activity), MainActivityContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)


    override fun showText(text: String) {
        Toast.makeText(activity,text,Toast.LENGTH_SHORT).show()
    }
}