package com.example.myandroidapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linearlayout)
        Log.d("MainActivity", "OnCreate called")



    }

    override fun onStart() {
        Log.d("MainActivity", "OnStart called")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MainActivity", "OnResume called")
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity", "OnPause called")
        super.onPause()
    }

    override fun onStop() {
        Log.d("MainActivity", "OnStop called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MainActivity", "OnDestroy called")
        super.onDestroy()
    }
}
