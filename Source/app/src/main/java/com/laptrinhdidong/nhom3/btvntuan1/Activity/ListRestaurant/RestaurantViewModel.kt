package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import androidx.lifecycle.ViewModel
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getDataSet
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getFavoriteSet
import com.laptrinhdidong.nhom3.btvntuan1.Information.Restaurant

class RestaurantViewModel() : ViewModel() {
    var option_menu: Boolean = true
    var data: MutableList<Restaurant> = getDataSet()
    var data_favorite: MutableList<Restaurant> = getFavoriteSet()
}