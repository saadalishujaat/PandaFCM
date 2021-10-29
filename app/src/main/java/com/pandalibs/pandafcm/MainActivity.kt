package com.pandalibs.pandafcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pandalibs.fcmlib.PandaFCM

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PandaFCM.setupFCM(this, "YourTopicName")

    }
}