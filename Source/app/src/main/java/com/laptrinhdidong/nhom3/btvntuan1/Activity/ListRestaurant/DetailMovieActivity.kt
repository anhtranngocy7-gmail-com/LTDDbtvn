package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.Activity.MovieData.MovieViewModel
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3datActivityDetailBinding
class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding:Nhom3datActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.nhom3dat_activity_detail)
    }
}