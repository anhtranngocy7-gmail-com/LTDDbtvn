package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocListRestaurantBinding


class ListRestaurantActivity : AppCompatActivity() {
    private lateinit var binding: Nhom3QuocListRestaurantBinding
    private  lateinit var viewModel: RestaurantViewModel
    private lateinit var adapter : RestaurantAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.nhom3_quoc_list_restaurant)
        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
       if(!viewModel.option_menu)
       {
           binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
           adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view,this)
        }else
       {
           adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview,this)
           binding.rcList.layoutManager=GridLayoutManager(applicationContext,2)
       }
        binding.rcList.adapter =adapter
        adapter.data = viewModel.data

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_switch_viewtype,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.general ->
            {
                viewModel.option_menu=false
                binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
                adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view,this)
                binding.rcList.adapter = adapter
                adapter.data= viewModel.data
                return true
            }
            R.id.favorite ->
            {
                viewModel.option_menu=true
                adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview,this)
                binding.rcList.layoutManager=GridLayoutManager(applicationContext,2)
                binding.rcList.adapter = adapter
                adapter.data= viewModel.data
                return true
            }else ->
        {
            return super.onOptionsItemSelected(item)
        }
        }

    }
}