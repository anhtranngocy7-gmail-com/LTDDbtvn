package com.laptrinhdidong.nhom3.btvntuan1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.Activity.Profile.DialogEdit
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnProfileBinding
import kotlinx.android.synthetic.main.nhom3_an_profile.*

class ProfileActivity : AppCompatActivity() {
    private  lateinit var binding: Nhom3AnProfileBinding
    private var account : Account = Account("", "", "", "")
    private lateinit var viewModel: ProfileViewModel
    private var idUser: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.nhom3_an_profile)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        viewModel.account.value = account
        Log.e("Profile", "Profile Activity _ onCreate")
        val bundle = intent.extras
        bundle?.let {
            val userInformation = bundle.getParcelable<UserInformationData>("userInformation")
            idUser = userInformation?.index
            viewModel.setFullName(DataStore.getListAccount()[idUser!!].fullname)
            viewModel.setEmail(DataStore.getListAccount()[idUser!!].email)
            viewModel.setPhone(DataStore.getListAccount()[idUser!!].phone)
            viewModel.setPass(DataStore.getListAccount()[idUser!!].password)
        }
        binding.apply {
            val dialogprofile = DialogEdit(this@ProfileActivity)
            dialogprofile.DialogProfileF( txt_Fullname_Profile, "Name",binding,viewModel)
            dialogprofile.DialogProfileF( txt_Phonenumber,"Phone Number",binding,viewModel)
            dialogprofile.DialogProfileF( txt_Email_profile,"Email",binding,viewModel)
        }
        binding.account = viewModel.account.value
        DataStore.getListAccount()[idUser!!]= viewModel.account.value!!
    }
}




