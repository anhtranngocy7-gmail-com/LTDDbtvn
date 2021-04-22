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
        binding.rcList.adapter = viewModel.adapter
       if(!viewModel.layoutManager)
       {
           binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
        }else
       {
           binding.rcList.layoutManager=GridLayoutManager(applicationContext,2)
       }
        viewModel.adapter.data = getDataSet()

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
                viewModel.adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view)
                viewModel.layoutManager=false
                binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
                binding.rcList.adapter = viewModel.adapter
                viewModel.adapter.data= getDataSet()
                return true
            }
            R.id.type_Grid ->
            {
                viewModel.adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview)
                viewModel.layoutManager=true
                binding.rcList.layoutManager=GridLayoutManager(applicationContext,2)
                binding.rcList.adapter = viewModel.adapter
                viewModel.adapter.data= getDataSet()
                return true
            }else ->
        {
            return super.onOptionsItemSelected(item)
        }
        }

    }
}