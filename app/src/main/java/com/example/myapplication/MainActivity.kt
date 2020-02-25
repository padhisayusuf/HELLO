package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(this, navigationHome)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navigationHome)
        return navController.navigateUp()
    }

}
