package com.laptrinhdidong.nhom3.btvntuan1.Flagment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.*
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.ListRestaurantActivity
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnLoginBinding
import kotlinx.android.synthetic.main.nhom3_an_login.*

class LoginFragment:Fragment() {
    private lateinit var binding : Nhom3AnLoginBinding
    private lateinit var viewModel: LoginViewModel
    private var account : Account = Account("Default fullname", "default email", "Default password", "000000000")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.nhom3_an_login,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.account = viewModel.account
        binding.apply {
            btn_login.setOnClickListener {
                var check_login : Int =viewModel.checkLogin(binding)
                if(check_login!=-1)
                {
                    val intent = Intent(context, ListRestaurantActivity::class.java)
                    val bundle = Bundle()
                    val userInformation = UserInformationData(index = check_login)
                    parentFragmentManager.commit {
                        setReorderingAllowed(true)
                        replace<RestaurantListScreenFragment>(R.id.frag_container_view)
                        addToBackStack(null)
                    }
                }else
                {
                    Toast.makeText(context, "Please try again", Toast.LENGTH_SHORT).show()
                }
                invalidateAll()

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