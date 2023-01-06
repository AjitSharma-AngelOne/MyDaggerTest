package com.example.mydaggertest.api

import android.util.Log
import com.example.mydaggertest.utils.AppUtils.Companion.TAG
import javax.inject.Inject

class SaveDataService @Inject constructor() {
    fun saveData() {
        Log.d(TAG, "Data saved on DB")
    }
}