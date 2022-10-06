package com.example.lifecyclestatusapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatusViewModel : ViewModel() {
    val statusList = mutableListOf<String>()
    val liveStatusList = MutableLiveData<MutableList<String>>()

    fun addStatus(status: String) {
        statusList.add(status)
        liveStatusList.value = statusList
    }
}