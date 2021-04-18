package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import android.widget.Button
import kotlinx.android.synthetic.main.nhom3_binh_onboarding2.view.*
import kotlinx.android.synthetic.main.nhom3_dat_onboard.*

class OnboardingtwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("OnboardingtwoActivity", "Onboardingtwo Activity _ onCreate")
        setContentView(R.layout.nhom3_binh_onboarding2)

    }

    override fun onStart() {
        super.onStart()
        Log.e("OnboardingtwoActivity", "Onboardingtwo Activity _ onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("OnboardingtwoActivity", "Onboardingtwo Activity _ onResume")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.e("OnboardingtwoActivity", "Onboardingtwo Activity _ onTouch")
        val intent = Intent(this@OnboardingtwoActivity, OnboardingthreeActivity::class.java)
        startActivity(intent)
        return super.onTouchEvent(event)

    }
}