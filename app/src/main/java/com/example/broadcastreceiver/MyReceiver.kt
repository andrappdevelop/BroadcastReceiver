package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            "loaded" -> {
                val percent = intent.getIntExtra("percent", 0)
                Toast.makeText(
                    context,
                    "Loaded $percent",
                    Toast.LENGTH_SHORT
                ).show()
            }
            ACTION_CLICKED -> {
                val countOfClicks = intent.getIntExtra(EXTRA_COUNT, 0)
                Toast.makeText(
                    context,
                    "CLicked $countOfClicks times",
                    Toast.LENGTH_SHORT
                ).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val stateChanged = intent.getBooleanExtra("state", false)
                Toast.makeText(
                    context,
                    "Airplane mode changed. Turn on: $stateChanged",
                    Toast.LENGTH_LONG
                ).show()
            }
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(
                    context,
                    "Power connected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    companion object {
        const val ACTION_CLICKED = "clicked"
        const val EXTRA_COUNT = "count"
    }
}