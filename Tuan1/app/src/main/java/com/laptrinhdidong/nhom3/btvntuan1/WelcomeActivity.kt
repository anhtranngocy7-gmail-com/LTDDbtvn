package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_binh_welcome)
        val btn_signin = findViewById<Button>(R.id.signin)

        btn_signin.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intent)
        }

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