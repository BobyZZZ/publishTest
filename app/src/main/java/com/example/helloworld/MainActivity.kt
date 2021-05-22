package com.example.helloworld

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bb.mylibrary.test
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTest.setOnClickListener{
            test(it.context)
        }
    }
}

fun testFromApp(context: Context) = Toast.makeText(context,"toast from TestLib", Toast.LENGTH_SHORT).show()