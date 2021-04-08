package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.nhom3_quoc_onboarding3.*

class OnboardingthreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_quoc_onboarding3)

    }

    override fun onStart() {
        super.onStart()
        Log.e("OnboardingthreeActivity", "Onboardingthree Activity _ onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e("OnboardingthreeActivity", "Onboardingthree Activity_ onResume")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.e("OnboardingthreeActivity", "Onboardingthree Activity_ onTouch")
        val intent = Intent(this@OnboardingthreeActivity, WelcomeActivity::class.java)
        startActivity(intent)
        return super.onTouchEvent(event)

    }
}