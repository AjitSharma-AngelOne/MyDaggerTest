package com.example.mydaggertest

import com.example.mydaggertest.di.DaggerTestUserRegistrationComponent
import com.example.mydaggertest.di.TestUserRegistrationComponent
import org.junit.Before

class MainActivityTest {

    lateinit var mTestUserRegistrationComponent: TestUserRegistrationComponent

    @Before
    fun setUp() {

        mTestUserRegistrationComponent = DaggerTestUserRegistrationComponent.builder().build()
        mTestUserRegistrationComponent.inject(this)
    }

}