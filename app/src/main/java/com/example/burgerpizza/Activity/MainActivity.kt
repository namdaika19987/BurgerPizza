package com.example.burgerpizza.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.burgerpizza.R
import com.example.burgerpizza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this, onBackInvokedCallback)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, SplashActivity2::class.java)
            startActivity(intent)
        }

        binding.imageFilterNext.setOnClickListener {
            val intent = Intent(this, SplashActivity2::class.java)
            startActivity(intent)
        }

        binding.skip.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
    }

    private val onBackInvokedCallback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
        }
    }
}