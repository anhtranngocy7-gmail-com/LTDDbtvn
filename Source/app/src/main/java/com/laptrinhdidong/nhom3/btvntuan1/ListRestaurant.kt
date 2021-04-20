package com.laptrinhdidong.nhom3.btvntuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getDataSet
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocListRestaurantBinding

class ListRestaurant : AppCompatActivity() {
    private  lateinit var binding: Nhom3QuocListRestaurantBinding
    private  lateinit var viewModel: ListRestaurantViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.nhom3_quoc_list_restaurant)
        viewModel = ViewModelProvider(this).get(ListRestaurantViewModel::class.java)

        val adapter = RestaurantAdapter()
        binding.rcList.adapter = adapter
        adapter.data = getDataSet()

    }
}