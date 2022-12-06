package com.alanafdev.retrofit.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alanafdev.retrofit.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnUser.setOnClickListener{
            Intent(this@MainActivity, MainActivity::class.java).also {
                startActivity(it)
            }
        }
        btnPost.setOnClickListener {
            Intent(this@MainActivity,MainActivity::class.java).also {
                startActivity(it)
            }
        }




    }
}