package com.laptrinhdidong.nhom3.btvntuan1

import androidx.lifecycle.MutableLiveData

object DataStore {
    private var list: MutableList<Account> = mutableListOf()
    ///hàn lấy ra tất cả account (dùng để so sánh ở trang login)
    fun getListAccount():MutableList<Account>
    {
        return list
    }
    ///hàm thêm mới account (dùng ở trang signup)
    fun addAccount(account: Account)
    {
        list.add(account)
    }
    ///các hàm set (dùng ở trang profile)
    fun setFullNameAccount(index: Int?,fullname : String)
    {
        list[index!!].fullname=fullname
    }
    fun setEmailAccount(index: Int?,email: String)
    {
        list[index!!].email=email
    }
    fun setPhoneAccount(index: Int?,phone: String)
    {
        list[index!!].phone = phone
    }
//>>>>>>> 534ffcc99d615b69c50b3f8a7cca57ee488631a7
//    }
//    ///hàn lấy ra tất cả account (dùng để so sánh ở trang login)
////    fun getListAccount():MutableList<Account>{
////        return list
////    }
////    ///hàm thêm mới account (dùng ở trang signup)
////    fun addAccount(account: Account)
////    {
////        list.add(account)
////    }
////    ///các hàm set (dùng ở trang profile)
////    fun setFullNameAccount(index: Int,fullname : String)
////    {
////        list[index].fullname=fullname
////    }
////    fun setEmailAccount(index: Int,email: String)
////    {
////        list[index].email=email
////    }
////    fun setPhoneAccount(index: Int,phone: String)
////    {
////        list[index].phone=phone
////    }
}