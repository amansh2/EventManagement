package com.example.eventmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.eventmanagement.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)

        // create Login
    binding.button.setOnClickListener {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    }
}