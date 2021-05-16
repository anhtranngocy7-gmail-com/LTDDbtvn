package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.Fragment.LinearListFavoriteFragment
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.Fragment.LinearListFragment
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.ActivityRestaurantBinding

class RestaurantActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestaurantBinding
    private lateinit var viewModel: RestaurantViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_restaurant)
        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            if (!viewModel.times) {
                add<LinearListFragment>(R.id.fragment_mainapp)
                addToBackStack(null)
            }
        }
        viewModel.times=true
        BindingOnchangeOption()
    }
    private fun BindingOnchangeOption() {
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
            supportFragmentManager.commit {
                setReorderingAllowed(true)

                when (item.itemId) {
                    R.id.general -> {
                        replace<LinearListFragment>(R.id.fragment_mainapp)
                    }
                    R.id.favorite -> {
                        replace<LinearListFavoriteFragment>(R.id.fragment_mainapp)
                    }
                }
                addToBackStack(null)
            }
            return@OnNavigationItemSelectedListener true
        })
    }
}