package com.example.pil_hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pil_hello_world.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = MainActivityPresenter(MainActivityView(this),MainActivityModel())

        binding.changeTitleButton.setOnClickListener {
            presenter.onButtonPressed(binding.editText.text.toString())
        }

    }

}