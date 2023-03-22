package com.example.burgerpizza.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.example.burgerpizza.R
import com.example.burgerpizza.databinding.ActivityAdminBinding

class AdminActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdminBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this, onBackInvokedCallback)

        binding.back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    // sự kiện k cho back lại màn hình
    override fun onBackPressed() {
    }

    private val onBackInvokedCallback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
        }
    }
}