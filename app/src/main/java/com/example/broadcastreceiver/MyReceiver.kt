package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_BATTERY_CHANGED -> {
                Toast.makeText(context, "Battery changed", Toast.LENGTH_LONG).show()
            }
        }
    }
}