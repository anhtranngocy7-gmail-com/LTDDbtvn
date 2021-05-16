package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.laptrinhdidong.nhom3.btvntuan1.Activity.MovieData.MovieViewModel
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3datActivityDetailBinding
class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding:Nhom3datActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.nhom3dat_activity_detail)
        binding.movieRate.text= "8.7"

        Glide.with(this).load("link ảnh").centerCrop().placeholder(R.drawable.loading_icon).into(binding.moviePoster)
    }
}