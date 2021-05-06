package com.laptrinhdidong.nhom3.btvntuan1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.laptrinhdidong.nhom3.btvntuan1.Activity.Welcome.SplashFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Splash", "Splash Activity _ onCreate")
        setContentView(R.layout.activity_main)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<SplashFragment>(R.id.frag_container_view)
        }
    }
<<<<<<< HEAD
=======


>>>>>>> 2da3c483853df9fa31535c59639516a0eb566931
}