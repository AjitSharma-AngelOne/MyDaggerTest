package com.example.mydaggertest.di

import com.example.mydaggertest.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}