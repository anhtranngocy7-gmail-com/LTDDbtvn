package com.laptrinhdidong.nhom3.btvntuan1


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import kotlinx.android.synthetic.main.nhom3_binh_splash.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Splash", "Splash Activity _ onCreate")
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
                val intent = Intent(this@MainActivity, OnboardingOneActivity::class.java)
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