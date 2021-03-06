package com.laptrinhdidong.nhom3.btvntuan1.Activity.Movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3datActivityDetailBinding
import kotlinx.android.synthetic.main.nhom3dat_activity_detail.*

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding:Nhom3datActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.nhom3dat_activity_detail)

        val intent = getIntent()
        val bundle = intent.getExtras()
        if(bundle != null) {
            val viewmovie= bundle.getString("KEY_VIEW")
            binding.movieLanguage.text = viewmovie

            val poster ="https://image.tmdb.org/t/p/w500" + bundle.getString("KEY_POSTER")
            Glide.with(this).load( poster).centerCrop().placeholder(R.drawable.loading_icon).into(binding.moviePoster)

            val title = bundle.getString("KEY_TITLE")
            binding.textView5.text = title

            val rate = bundle.getString("KEY_RATE")
            binding.movieRate.text = rate

            val overview = bundle.getString("KEY_OVERVIEW")
            binding.textView6.text = overview


        }

    }
}