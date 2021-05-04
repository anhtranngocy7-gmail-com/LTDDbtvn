package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.laptrinhdidong.nhom3.btvntuan1.DataStore
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.ActivityRestaurantBinding

class RestaurantActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_restaurant)
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
            supportFragmentManager.commit {
                setReorderingAllowed(true)

                when (item.itemId) {
                    R.id.general -> replace<LinearListFragment>(R.id.fragment_mainapp)
                    R.id.favorite -> replace<LinearListFavoriteFragment>(R.id.fragment_mainapp)
                }
                addToBackStack(null)
            }

            return@OnNavigationItemSelectedListener true
        })
    }
}