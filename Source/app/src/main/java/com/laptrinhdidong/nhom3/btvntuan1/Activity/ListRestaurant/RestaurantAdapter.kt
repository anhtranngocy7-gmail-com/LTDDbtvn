package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.laptrinhdidong.nhom3.btvntuan1.R

class RestaurantAdapter(ItemViewLayout: Int) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>(){
    //Create Data to show RestaurantList
    private var item_view: Int = ItemViewLayout
    var data: List<Restaurant> = listOf()
        set(value){
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(item_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var item = data[position]
        holder.tvName.text = item.Name
        holder.tvAddress.text =item.Address
        holder.imageAvatar.setImageResource(item.avatar)

    }

    override fun getItemCount(): Int {

        return data.size
    }
    //Create ViewHolder
    class ViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
        val  imageAvatar = itemView.findViewById<ImageView>(R.id.imageView9)

    }


}