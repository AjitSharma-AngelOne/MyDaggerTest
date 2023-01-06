package com.example.mydaggertest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggertest.di.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        userRegistrationComponent.inject(this)
    }
}
