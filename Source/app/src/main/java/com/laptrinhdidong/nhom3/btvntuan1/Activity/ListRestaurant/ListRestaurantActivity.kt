package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getDataSet
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocListRestaurantBinding


class ListRestaurantActivity : AppCompatActivity() {
    private lateinit var binding: Nhom3QuocListRestaurantBinding
    private  lateinit var viewModel: ListRestaurantViewModel
    private lateinit var adapter : RestaurantAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.nhom3_quoc_list_restaurant)
        viewModel = ViewModelProvider(this).get(ListRestaurantViewModel::class.java)
       if(!viewModel.layoutManager)
       {
           binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
           adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view,this)
        }else
       {
           adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview,this)
           binding.rcList.layoutManager=GridLayoutManager(applicationContext,2)
       }
        binding.rcList.adapter =adapter
        adapter.data = getDataSet()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_switch_viewtype,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.type_Linear ->
            {
                viewModel.layoutManager=false
                binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
                adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view,this)
                binding.rcList.adapter = adapter
                adapter.data= getDataSet()
                return true
            }
            R.id.type_Grid ->
            {
                viewModel.layoutManager=true
                adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview,this)
                binding.rcList.layoutManager=GridLayoutManager(applicationContext,2)
                binding.rcList.adapter = adapter
                adapter.data= getDataSet()
                return true
            }else ->
        {
            return super.onOptionsItemSelected(item)
        }
        }

    }
}