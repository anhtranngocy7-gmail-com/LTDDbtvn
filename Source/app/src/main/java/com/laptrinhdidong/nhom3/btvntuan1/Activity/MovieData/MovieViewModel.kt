package com.laptrinhdidong.nhom3.btvntuan1.Activity.MovieData

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.laptrinhdidong.nhom3.btvntuan1.rest.RestClient
import kotlinx.coroutines.launch

class MovieViewModel: ViewModel() {

    fun getNowplaying()
    {
        viewModelScope.launch{
            val movieRest = RestClient.getInstance().API.listNowPlayMovies(language = "en-US",page = 1)
            Log.e("NowPlaying",movieRest.results.toString())
        }
        Log.e("aa","anh")

    }
//    fun getToprated()
//    {
//        viewModelScope.launch {
//            val toprateRest = RestClient.getInstance().API.listTopRated(language = "en-US",page = 1)
//            Log.e("TopRated",toprateRest.results.toString())
//        }
//    }

}