package com.laptrinhdidong.nhom3.btvntuan1


import android.content.Intent
import android.net.ssl.SSLEngines
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.nhom3_binh_splash.view.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_binh_splash)
    }

    override fun onStart() {
        super.onStart()
        Log.e("Splash", "Splash Activity _ onStart")

        val timer = object : CountDownTimer(6000, 1000){
            override fun onTick(millisUntilFinished: Long) {
                Log.e("Splash", "Splash Activity _ onStart")
            }

            override fun onFinish() {
                val intent = Intent(this@MainActivity, Onboarding2::class.java)
                startActivity(intent)
            }
        }
        timer.start()
    }

    override fun onResume() {
        super.onResume()
        Log.e("Splash", "Splash Activity _ onResume")
    }
}