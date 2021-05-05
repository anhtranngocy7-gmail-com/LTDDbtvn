package com.laptrinhdidong.nhom3.btvntuan1.Flagment
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.ListRestaurantActivity
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.ListRestaurantViewModel
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.RestaurantAdapter
import com.laptrinhdidong.nhom3.btvntuan1.R
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocListRestaurantBinding

class RestaurantListScreenFragment:Fragment() {
    private lateinit var binding: Nhom3QuocListRestaurantBinding
    private  lateinit var viewModel: ListRestaurantViewModel
    private lateinit var adapter : RestaurantAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.nhom3_quoc_list_restaurant,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListRestaurantViewModel::class.java)
        if(!viewModel.layoutManager)
        {
            binding.rcList.layoutManager=LinearLayoutManager(applicationContext)
            adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view, )
        }else
        {
            adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview, ListRestaurantActivity())
            binding.rcList.layoutManager= GridLayoutManager(activity,2)
        }
        binding.rcList.adapter =adapter
        adapter.data = viewModel.data
    }

    override fun setHasOptionsMenu(hasMenu: Boolean) {
        super.setHasOptionsMenu(hasMenu)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // TODO Add your menu entries here
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item!!.itemId)
        {
            R.id.type_Linear ->
            {
                viewModel.layoutManager=false
                binding.rcList.layoutManager=LinearLayoutManager(context)
                adapter=RestaurantAdapter(R.layout.nhom3_quoc_restaurant_item_view,
                    ListRestaurantActivity()
                )
                binding.rcList.adapter = adapter
                adapter.data= viewModel.data
                return true
            }
            R.id.type_Grid ->
            {
                viewModel.layoutManager=true
                adapter=RestaurantAdapter(R.layout.nhom3_an_restaurant_item_cardview,ListRestaurantActivity())
                binding.rcList.layoutManager=GridLayoutManager(context,2)
                binding.rcList.adapter = adapter
                adapter.data= viewModel.data
                return true
            }else ->
        {
            return super.onOptionsItemSelected(item)
        }
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
}