package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getDataSet
import com.laptrinhdidong.nhom3.btvntuan1.DataStore.getFavoriteSet
import com.laptrinhdidong.nhom3.btvntuan1.Information.Restaurant
import com.laptrinhdidong.nhom3.btvntuan1.Movie.Movie
import com.laptrinhdidong.nhom3.btvntuan1.rest.RestClient
import kotlinx.coroutines.launch

class RestaurantViewModel() : ViewModel() {
    var times : Boolean =false
    var times_fragment : Boolean =false
    var option_type_view: Boolean =false
    
    fun getNowplaying() : LiveData<MutableList<Movie>>
    {
        val tmp = MutableLiveData<MutableList<Movie>>()
        viewModelScope.launch{
            val movieRest = RestClient.getInstance().API.listNowPlayMovies(language = "en-US",page = 1)
            val result =movieRest.results.toMutableList()
            tmp.postValue(result)
            Log.e("localplaying",tmp.toString())
        }

        return tmp
    }
    fun getToprated() : LiveData<MutableList<Movie>>
    {
        val tmp = MutableLiveData<MutableList<Movie>>()
        viewModelScope.launch {
            val toprateRest = RestClient.getInstance().API.listTopRated(language = "en-US",page = 1)
            val result = toprateRest.results.toMutableList()
            tmp.postValue(result)
            Log.e("localtop",tmp.toString())
        }
        return tmp
    }
}