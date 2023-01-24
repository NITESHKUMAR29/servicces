package com.example.serivices

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.serivices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){
            startServices.setOnClickListener {
//                val intent= Intent(this@MainActivity,MyServices::class.java)
//                startService(intent)
                startService(Intent(this@MainActivity, MyServices::class.java))
            }
        }

    }
}