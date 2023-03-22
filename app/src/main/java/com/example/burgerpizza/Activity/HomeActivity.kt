package com.example.burgerpizza.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.burgerpizza.R
import com.example.burgerpizza.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var drawer: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this, onBackInvokedCallback)

        drawer = binding.drawerLayout

        binding?.imageFilterView?.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }

        val navView: BottomNavigationView = binding.bottomNavView

        val navController = findNavController(R.id.frame_layout)
        navView.setupWithNavController(navController)

    }

    override fun onBackPressed() {
    }

    private val onBackInvokedCallback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
        }
    }

}