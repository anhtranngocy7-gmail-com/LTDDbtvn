package com.laptrinhdidong.nhom3.btvntuan1.Activity.MovieData

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.R

class MovieActivity:AppCompatActivity() {
    lateinit var movieViewmodel: MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_anh_movie)
        movieViewmodel = ViewModelProvider(this).get(MovieViewModel::class.java)
        movieViewmodel.getNowplaying()
        movieViewmodel.getToprated()
        movieViewmodel.getNowplaying2().toString()
    }

    override fun onStart() {
        super.onStart()
        movieViewmodel.getNowplaying()
        movieViewmodel.getToprated()
        movieViewmodel.getNowplaying2().toString()
    }

    override fun onResume() {
        super.onResume()
        movieViewmodel.getNowplaying()
        movieViewmodel.getToprated()
        movieViewmodel.getNowplaying2().toString()
    }
}