package com.laptrinhdidong.nhom3.btvntuan1

import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocSignupBinding

class SignUpActivity : AppCompatActivity()  {
    private lateinit var binding: Nhom3QuocSignupBinding
    private lateinit var viewModel: SignUpViewModel
    private var account : Account = Account("Default fullname", "Default email", "Default password","Default phone")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=ViewModelProvider(this).get(SignUpViewModel::class.java)
        binding=DataBindingUtil.setContentView(this,R.layout.nhom3_quoc_signup)
        binding.btnSignup123.setOnClickListener {
            if (registerUser(binding.btnSignup123)) {
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
        }
    }
    fun validateEmail(): Boolean{
        var etEmail = binding.editTextEmail.text.toString()
        var emailPattern = "[a-zA-z0._-]+@[a-z]+\\.+[a-z]+"
        if (etEmail.isEmpty()){
            binding.editTextEmail.setError("Field cannot be empty")
            return false
        }
        else if (!etEmail.matches(Regex(emailPattern))){
            binding.editTextEmail.setError("Invalid email address")
            return false
        }
        else{
            binding.editTextEmail.setError(null)
            return true
        }
    }
    fun validatePassword(): Boolean{
        var etPassword = binding.editTextPassword.text.toString()
        var passwordVal = "(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[!@#$%^&*()])" + ".{8,}"
        if (etPassword.isEmpty()){
            binding.editTextPassword.setError("Field cannot be empty")
            return false
        }
        else if (!etPassword.matches(Regex(passwordVal))){
            binding.editTextPassword.setError("Password is too weak")
            return false
        }
        else{
            binding.editTextPassword.setError(null)
            return true
        }
    }
    fun registerUser(view: View): Boolean {
        if (!validatePassword() or !validateEmail()) {
            return false;
        }
        else
            return true
    }
}