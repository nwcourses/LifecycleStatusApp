package com.example.lifecyclestatusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import javax.net.ssl.SSLEngineResult

class MainActivity : AppCompatActivity() {
    val statusViewModel: StatusViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        statusViewModel.liveStatusList.observe(this, Observer {
            findViewById<TextView>(R.id.status).text = it.joinToString("\n")
        })

        lifecycle.addObserver(StatusLifecycleObserver(statusViewModel))
    }
}