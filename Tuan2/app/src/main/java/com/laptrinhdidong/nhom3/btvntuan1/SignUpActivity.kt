package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocSignupBinding

class SignUpActivity : AppCompatActivity()  {
    private lateinit var binding: Nhom3QuocSignupBinding
    private lateinit var viewModel: SignUpViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.nhom3_quoc_signup)
        viewModel=ViewModelProvider(this).get(SignUpViewModel::class.java)
        binding.btnSignup123.setOnClickListener {
            viewModel.account.fullname=binding.editTextFullname.text.toString().trim()
            viewModel.account.email=binding.editTextEmail.text.toString().trim()
            viewModel.account.password=binding.editTextPassword.toString().trim()
            DataStore.fullname=viewModel.account.fullname
            DataStore.email=viewModel.account.email
            DataStore.password=viewModel.account.password
            binding.txtEmail.text=viewModel.account.email
            val intent = Intent(this@SignUpActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}