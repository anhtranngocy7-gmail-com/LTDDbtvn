package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.laptrinhdidong.nhom3.btvntuan1.DataStore
import com.laptrinhdidong.nhom3.btvntuan1.Information.Restaurant
import com.laptrinhdidong.nhom3.btvntuan1.Movie.Movie
import com.laptrinhdidong.nhom3.btvntuan1.R


class RestaurantRcvAdapter(ItemViewLayout: Int, ctx: Context) :
    RecyclerView.Adapter<RestaurantRcvAdapter.ViewHolder>() {

    private var item_view: Int = ItemViewLayout
    private var context: Context = ctx
    var data = mutableListOf<Movie>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var item = data[position]
//        holder.favorite.isChecked = item.Favorite
        holder.tvName.text = item.originalTitle
        holder.tvAddress.text = "Rate: "+item.voteAverage.toString()
        var strtemp="https://image.tmdb.org/t/p/w500"+item.backdropPath
        Glide.with(context).load(strtemp).centerCrop().placeholder(R.drawable.loading_icon).into(holder.imageAvatar)
//        holder.favorite.setOnClickListener {
//            DataStore.setFavorite(!item.Favorite, item)
//        }
    }

    override fun getItemCount(): Int {

        return data.size
    }

    //Create ViewHolder
    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
        val imageAvatar = itemView.findViewById<ImageView>(R.id.imageView9)

    }

}