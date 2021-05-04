package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.laptrinhdidong.nhom3.btvntuan1.DataStore
import com.laptrinhdidong.nhom3.btvntuan1.R

class LinearListFragment():Fragment() {
    private lateinit var adapter : RestaurantAdapter
    private lateinit var rcv: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.nhom3_quoc_list_restaurant, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter= RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view, requireContext())
        rcv=view.findViewById(R.id.rcList)
        rcv.layoutManager=LinearLayoutManager(context)
        rcv.adapter=adapter
        adapter.data= DataStore.getDataSet()
    }
}