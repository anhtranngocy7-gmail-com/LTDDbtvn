package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.util.Log
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
    var option_type_view: Boolean =true
    var data_playingfilm: MutableList<Movie> = mutableListOf()
    var data_toprate: MutableList<Movie> = mutableListOf()
    
    fun getNowplaying() : MutableList<Movie>
    {
        
        viewModelScope.launch{
            val movieRest = RestClient.getInstance().API.listNowPlayMovies(language = "en-US",page = 1)
            data_playingfilm=movieRest.results
            Log.e("localplaying",data_playingfilm.toString())
        }
        Log.e("globalplaying",data_playingfilm.toString())
        return data_playingfilm
    }
    fun getToprated() : MutableList<Movie>
    {
        viewModelScope.launch {
            val toprateRest = RestClient.getInstance().API.listTopRated(language = "en-US",page = 1)
            data_toprate =toprateRest.results
        }
        return data_toprate
    }
}