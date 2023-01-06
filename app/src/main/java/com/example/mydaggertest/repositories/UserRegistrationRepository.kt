package com.example.mydaggertest.repositories

import com.example.mydaggertest.api.SaveDataService
import javax.inject.Inject

class UserRegistrationRepository @Inject constructor(
    private val saveDataService: SaveDataService
) {
    private fun saveData() {
        saveDataService.saveData()
    }
}