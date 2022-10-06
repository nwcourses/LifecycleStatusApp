package com.example.lifecyclestatusapp

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class StatusLifecycleObserver(val viewModel: StatusViewModel) : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        viewModel.addStatus("Created")
    }
    override fun onResume(owner: LifecycleOwner) {
        viewModel.addStatus("Resumed")
    }
    override fun onPause(owner: LifecycleOwner) {
        viewModel.addStatus("Paused")
    }
    override fun onDestroy(owner: LifecycleOwner) {
        viewModel.addStatus("Destroyed")
    }
}