package com.laptrinhdidong.nhom3.btvntuan1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_binh_welcome)
    }

    override fun onStart() {
        super.onStart()
        Log.e("Welcome", "Welcome Activity _ onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Welcome", "Welcome Activity _ onResume")
    }

}