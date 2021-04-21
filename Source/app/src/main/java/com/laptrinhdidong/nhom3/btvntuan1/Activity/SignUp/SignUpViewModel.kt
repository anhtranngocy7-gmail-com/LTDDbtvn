package com.laptrinhdidong.nhom3.btvntuan1

import android.view.View
import android.widget.EditText
import androidx.lifecycle.ViewModel
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocSignupBinding


class SignUpViewModel : ViewModel()
{
    var account : Account=Account("","","","")
    fun validateEmail(binding: Nhom3QuocSignupBinding): Boolean{
        var etEmail = binding.editTextEmail.text.toString()
        var emailPattern = "[a-zA-z0._-]+@[a-z]+\\.+[a-z]+"
        if (etEmail.isEmpty()){
            binding.editTextEmail.error = "Field cannot be empty"
            return false
        }
        else if (!etEmail.matches(Regex(emailPattern))){
            binding.editTextEmail.error = "Invalid email address"
            return false
        }
        else {
            binding.editTextEmail.error = null
            return true
        }
    }
    fun validatePassword(binding: Nhom3QuocSignupBinding): Boolean{
        var etPassword = binding.editTextPassword.text.toString()
        var passwordVal = "(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[!@#$%^&*()])" + ".{8,}"
        if (etPassword.isEmpty()){
            binding.editTextPassword.error = "Field cannot be empty"
            return false
        }
        else if (!etPassword.matches(Regex(passwordVal))){
            binding.editTextPassword.error = "Password is too weak"
            return false
        }
        else{
            binding.editTextPassword.error = null
            return true
        }
    }
    fun registerUser(view: View,binding: Nhom3QuocSignupBinding): Boolean {
        return !(!validatePassword(binding) or !validateEmail(binding))
    }

}