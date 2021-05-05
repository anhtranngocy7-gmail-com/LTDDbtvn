package com.laptrinhdidong.nhom3.btvntuan1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.laptrinhdidong.nhom3.btvntuan1.Flagment.WelcomeFragment
import kotlinx.android.synthetic.main.nhom3_binh_splash.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Splash", "Splash Activity _ onCreate")
        setContentView(R.layout.activity_main)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<WelcomeFragment>(R.id.frag_container_view)
        }
    }



//    override fun onStart() {
//        super.onStart()
//        Log.e("Splash", "Splash Activity _ onStart")
//
//        val timer = object : CountDownTimer(6000, 1000){
//            override fun onTick(millisUntilFinished: Long) {
//                Log.e("Splash", "Splash Activity _ onStart")
//            }
//
//            override fun onFinish() {
//                val intent = Intent(this@MainActivity, OnboardingOneActivity::class.java)
//                startActivity(intent)
//            }
//        }
//        timer.start()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("Splash", "Splash Activity _ onResume")
//    }
}