package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent

class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("OnboardingOneActivity", "OnboardingOne Activity _ onCreate")
        setContentView(R.layout.nhom3_dat_onboard)
    }

    override fun onStart() {
        super.onStart()
        Log.e("OnboardingOneActivity", "OnboardingOne Activity _ onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("OnboardingOneActivity", "OnboardingOne Activity _ onResume")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.e("OnboardingOneActivity", "OnboardingOne Activity _ onTouch")
        val intent = Intent(this@OnboardingOneActivity, OnboardingtwoActivity::class.java)
        startActivity(intent)
        return super.onTouchEvent(event)

    }

}