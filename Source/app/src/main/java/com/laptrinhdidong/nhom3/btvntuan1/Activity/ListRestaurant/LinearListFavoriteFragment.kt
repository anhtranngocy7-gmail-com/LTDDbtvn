package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.laptrinhdidong.nhom3.btvntuan1.DataStore
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocListRestaurantBinding

class LinearListFavoriteFragment : Fragment() {
    private lateinit var viewDataBinding: Nhom3QuocListRestaurantBinding
    private  lateinit var viewModel: RestaurantViewModel
    private lateinit var adapter: RestaurantAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
        viewDataBinding = DataBindingUtil.inflate<Nhom3QuocListRestaurantBinding>(
            inflater,
            R.layout.nhom3_quoc_list_restaurant,
            container,
            false
        )
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view, requireContext())
        viewDataBinding.rcList.layoutManager = LinearLayoutManager(context)
        viewDataBinding.rcList.adapter = adapter
        adapter.data = viewModel.data_favorite
    }
}