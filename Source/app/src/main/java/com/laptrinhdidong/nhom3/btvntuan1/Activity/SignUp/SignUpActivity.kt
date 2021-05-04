package com.laptrinhdidong.nhom3.btvntuan1

import android.content.ContentValues
import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocSignupBinding

class SignUpActivity : AppCompatActivity()  {
    private lateinit var binding: Nhom3QuocSignupBinding
    private lateinit var viewModel: SignUpViewModel
    private var account : Account = Account("", "", "","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=ViewModelProvider(this).get(SignUpViewModel::class.java)
        binding=DataBindingUtil.setContentView(this,R.layout.nhom3_quoc_signup)
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
                val intent = Intent(this@SignUpActivity, LoginActivity::class.java)
                startActivity(intent)
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

}