package com.laptrinhdidong.nhom3.btvntuan1

import androidx.lifecycle.ViewModel
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnLoginBinding

class LoginViewModel : ViewModel(){
    var account : Account = Account("default fullname", "", "default password","")
    fun checkLogin(binding:Nhom3AnLoginBinding):Int{
        var email=binding.etEmailLogin.text.toString()
        var pass=binding.etPassLogin.text.toString()
        var indexTemp : Int =0
        for(item in DataStore.getListAccount())
        {
            if(email==item.email&&pass==item.password)
            {
                return indexTemp
            }
            indexTemp++
        }
        return -1
    }
}