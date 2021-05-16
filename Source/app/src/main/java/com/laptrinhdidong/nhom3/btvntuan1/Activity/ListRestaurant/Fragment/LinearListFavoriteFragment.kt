package com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.RestaurantRcvAdapter
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.RestaurantViewModel
import com.laptrinhdidong.nhom3.btvntuan1.Movie.Movie
import com.laptrinhdidong.nhom3.btvntuan1.OnItemClickListener
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocListRestaurantBinding

class LinearListFavoriteFragment : Fragment(), OnItemClickListener {
    private lateinit var viewDataBinding: Nhom3QuocListRestaurantBinding
    private lateinit var viewModel: RestaurantViewModel
    private lateinit var rcvAdapter: RestaurantRcvAdapter
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
        if(!viewModel.option_type_view)
        {
            ChangLayouManager(R.layout.nhom3_quoc_restaurant_item_view)
        }else
        {
            ChangLayouManager(R.layout.nhom3_an_restaurant_item_cardview)
        }
        onChangeViewType()
    }
    fun onChangeViewType()
    {
        viewDataBinding.spinnerViewtype.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               when(position)
               {
                   0 -> {
                       ChangLayouManager(R.layout.nhom3_quoc_restaurant_item_view)
                   }
                   1 ->{
                       ChangLayouManager(R.layout.nhom3_an_restaurant_item_cardview)
                   }
               }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
    fun ChangLayouManager(itemview :Int)
    {
        when(itemview)
        {
            R.layout.nhom3_quoc_restaurant_item_view ->{
                rcvAdapter = RestaurantRcvAdapter(R.layout.nhom3_quoc_restaurant_item_view, requireContext(),this)
                viewDataBinding.rcList.layoutManager = LinearLayoutManager(context)
                viewModel.option_type_view=true
            }

            R.layout.nhom3_an_restaurant_item_cardview ->{
                rcvAdapter = RestaurantRcvAdapter(R.layout.nhom3_an_restaurant_item_cardview, requireContext(),this)
                viewDataBinding.rcList.layoutManager = GridLayoutManager(requireContext(),2)
                viewModel.option_type_view=false
            }
        }
        viewDataBinding.rcList.adapter = rcvAdapter
        viewModel.getToprated().observe(viewLifecycleOwner, Observer { result ->
            rcvAdapter.data=result
        })
    }
    override fun onItemClick(movie: Movie) {
        Toast.makeText(requireContext(),movie.title.toString(),Toast.LENGTH_SHORT).show()
    }
}