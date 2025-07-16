package com.example.agrisphere.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.agrisphere.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AgriSphere)
        setContentView(R.layout.activity_login_register)
    }
}