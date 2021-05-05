package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getDataSet

class ListRestaurantViewModel() : ViewModel() {
    var layoutManager : Boolean =false
    var data:List<Restaurant> = getDataSet()
}