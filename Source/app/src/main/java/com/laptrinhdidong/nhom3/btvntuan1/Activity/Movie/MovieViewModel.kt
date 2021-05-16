package com.laptrinhdidong.nhom3.btvntuan1.Activity.Movie

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.laptrinhdidong.nhom3.btvntuan1.Movie.Movie
import com.laptrinhdidong.nhom3.btvntuan1.rest.RestClient
import kotlinx.coroutines.launch

class MovieViewModel() : ViewModel() {
    var times : Boolean =false
    var optionTypeView: Boolean =false
    
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
            val topRateRest = RestClient.getInstance().API.listTopRated(language = "en-US",page = 1)
            val result = topRateRest.results.toMutableList()
            tmp.postValue(result)
            Log.e("localtop",tmp.toString())
        }
        return tmp
    }
}