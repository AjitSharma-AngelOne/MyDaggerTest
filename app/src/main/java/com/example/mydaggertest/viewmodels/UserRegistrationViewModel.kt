package com.example.mydaggertest.viewmodels

import androidx.lifecycle.ViewModel
import com.example.mydaggertest.repositories.UserRegistrationRepository
import javax.inject.Inject

class UserRegistrationViewModel @Inject constructor(
    private val userRegistrationRepository: UserRegistrationRepository
) : ViewModel() {


}