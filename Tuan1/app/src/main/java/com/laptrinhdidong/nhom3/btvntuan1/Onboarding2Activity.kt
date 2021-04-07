package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.nhom3_binh_onboarding2.view.*
import kotlinx.android.synthetic.main.nhom3_onboard_dat.*

class Onboarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_binh_onboarding2)

    }

    override fun onStart() {
        super.onStart()
        Log.e("Onboarding2", "Onboarding2 Activity _ onStart")

//        val timer = object : CountDownTimer(3000, 1000){
//            override fun onTick(millisUntilFinished: Long) {
//                Log.e("Onboarding2", "Onboarding2 Activity _ onStart")
//            }
//
//            override fun onFinish() {
//                val intent = Intent(this@Onboarding2, Onboardingthree::class.java)
//                startActivity(intent)
//            }
//        }
//        timer.start()
    }

    override fun onResume() {
        super.onResume()
        Log.e("Onboarding2", "Onboarding2 Activity _ onResume")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val intent = Intent(this@Onboarding2Activity, Onboardingthree::class.java)
        startActivity(intent)
        return super.onTouchEvent(event)
    }
}