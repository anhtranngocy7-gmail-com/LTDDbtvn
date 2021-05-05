package com.laptrinhdidong.nhom3.btvntuan1.Flagment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.*
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocSignupBinding

class SignUpFragment:Fragment() {
    private lateinit var viewModel: SignUpViewModel
    private lateinit var binding : Nhom3QuocSignupBinding
    private var account : Account = Account("", "", "","")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.nhom3_quoc_signup,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)
        binding.btnSignup123.setOnClickListener {
            val editemail = binding.editTextEmail.text.toString()
            val editpass = binding.editTextPassword.text.toString()
            if ( (viewModel.registerUser(binding.btnSignup123,editpass,editemail))) {
                viewModel.account.fullname = binding.editTextFullname.text.toString().trim()
                viewModel.account.email = binding.editTextEmail.text.toString().trim()
                viewModel.account.password = binding.editTextPassword.text.toString().trim()
                var accountTempt: Account = Account(
                    viewModel.account.fullname,
                    viewModel.account.email,
                    viewModel.account.password,
                    "+84"
                )
                DataStore.addAccount(accountTempt)
                parentFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<LoginFragment>(R.id.frag_container_view)
                    addToBackStack(null)
                }
            }
            else {

                if (!viewModel.validatePassword(editpass)) {
                    binding.editTextPassword.error = "Password is too weak"
                }

                if (!viewModel.validateEmail(editemail)) {
                    binding.editTextEmail.error = "Invalid email address"
                }
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