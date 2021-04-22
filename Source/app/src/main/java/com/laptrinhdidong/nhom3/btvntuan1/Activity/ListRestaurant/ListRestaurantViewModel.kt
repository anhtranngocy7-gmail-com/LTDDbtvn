package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.laptrinhdidong.nhom3.btvntuan1.R

class ListRestaurantViewModel() : ViewModel() {
    var adapter :RestaurantAdapter = RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view)
    var layoutManager : Boolean =false
}