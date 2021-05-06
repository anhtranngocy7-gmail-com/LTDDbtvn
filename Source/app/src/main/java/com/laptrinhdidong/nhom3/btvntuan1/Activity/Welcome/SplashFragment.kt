package com.laptrinhdidong.nhom3.btvntuan1.Activity.Welcome

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.laptrinhdidong.nhom3.btvntuan1.Activity.Boarding.Fragment.OnboardingOneFragment
import com.laptrinhdidong.nhom3.btvntuan1.R


class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.nhom3_binh_splash, container, false)
        return view
    }

    override fun onStart() {
        super.onStart()
        Log.e("Splash", "Splash Activity _ onStart")

        val timer = object : CountDownTimer(3000, 1000){
            override fun onTick(millisUntilFinished: Long) {
                Log.e("Splash", "Splash Activity _ onStart")
            }

            override fun onFinish() {
                parentFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<OnboardingOneFragment>(R.id.frag_container_view)
                    addToBackStack(null)

                }
            }
        }
        timer.start()
    }

    override fun onResume() {
        super.onResume()
        Log.e("Splash", "Splash Activity _ onResume")
    }
}