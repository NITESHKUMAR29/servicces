package com.example.serivices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
class MyServices: Service() {


    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("servicess","Start onStart")
        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("servicess","Start ondestroy")
    }
}