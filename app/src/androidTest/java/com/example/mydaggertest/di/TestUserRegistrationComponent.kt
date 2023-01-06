package com.example.mydaggertest.di

import com.example.mydaggertest.MainActivityTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface TestUserRegistrationComponent: UserRegistrationComponent {
    fun inject(mainActivityTest: MainActivityTest)
}