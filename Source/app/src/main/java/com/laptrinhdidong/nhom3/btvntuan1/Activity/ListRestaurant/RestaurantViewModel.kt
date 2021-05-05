package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.laptrinhdidong.nhom3.btvntuan1.DataStore
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getDataSet
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getFavoriteSet

class RestaurantViewModel() : ViewModel() {
    var option_menu : Boolean =true
    var data:List<Restaurant> = getDataSet()
    var data_favorite:List<Restaurant> = getFavoriteSet()
}