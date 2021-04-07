package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.nhom3_quoc_onboarding3.*

class Onboardingthree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_quoc_onboarding3)
    }

    override fun onStart() {
        super.onStart()
        Log.e("Onboarding3", "Onboarding3 Activity _ onStart")

//        val timer = object : CountDownTimer(3000, 1000){
//            override fun onTick(millisUntilFinished: Long) {
//                Log.e("Onboarding3", "Onboarding3 Activity _ onStart")
//            }
//
//            override fun onFinish() {
//                val intent = Intent(this@Onboardingthree, Welcome::class.java)
//                startActivity(intent)
//            }
//        }
//        timer.start()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val intent = Intent(this@Onboardingthree, WelcomeActivity::class.java)
        startActivity(intent)
        return super.onTouchEvent(event)
    }
}