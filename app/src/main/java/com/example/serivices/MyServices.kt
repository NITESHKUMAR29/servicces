package com.example.serivices

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log
class MyServices: Service() {
    lateinit var mp:MediaPlayer


    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mp=MediaPlayer.create(this,Settings.System.DEFAULT_ALARM_ALERT_URI)
        mp.isLooping=true
        mp.start()
        return super.onStartCommand(intent, flags, startId)

    }
    override fun onDestroy() {
        mp.stop()
        super.onDestroy()
        Log.d("servicess","Start ondestroy")
    }
}