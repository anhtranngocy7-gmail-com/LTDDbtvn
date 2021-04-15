package com.laptrinhdidong.nhom3.btvntuan1

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnProfileBinding
import kotlinx.android.synthetic.main.nhom3_an_profile.*
import kotlinx.android.synthetic.main.nhom3_an_profile.txt_Fullname
import kotlinx.android.synthetic.main.nhom3_anh_vefificationcode.*
import kotlinx.android.synthetic.main.nhom3_quoc_signup.*

class ProfileActivity : AppCompatActivity() {
    private  lateinit var binding: Nhom3AnProfileBinding
    private var account : Account = Account("", "", "", "")
    private lateinit var viewModel: ProfileViewModel
    private var idUser: Int? = 0
    private var modeldialog: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.nhom3_an_profile)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        Log.e("Profile", "Profile Activity _ onCreate")
        val bundle = intent.extras
        bundle?.let {
            val userInformation = bundle.getParcelable<UserInformationData>("userInformation")
            idUser = userInformation?.index
            viewModel.account.fullname = DataStore.list.value?.get(idUser!!)?.fullname.toString()
            viewModel.account.email = DataStore.list.value?.get(idUser!!)?.email.toString()
            viewModel.account.phone = DataStore.list.value?.get(idUser!!)?.phone.toString()
        }
        binding.apply {
            DialogProfileF(1, txt_Fullname, "Name",idUser)
            DialogProfileF(2, txt_Phonenumber,"Phone Number",idUser)
            DialogProfileF(3,txt_Email_profile,"Email",idUser)
        }
        binding.account = viewMode
    }
    fun DialogProfileF(checkId: Int, TextviewDPF: TextView, title:String, idUser: Int?) {
        TextviewDPF.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialogLayout = inflater.inflate(R.layout.nhom3_anh_dialog_profile, null)
                val editTextProfile = dialogLayout.findViewById<EditText>(R.id.edit_username)
                with(builder) {
                    setTitle(title)
                    setPositiveButton("Apply")
                    { dialog, which_ ->
                        if (checkId == 1 ) {
                            viewModel.account.fullname = editTextProfile.text.toString().trim()

                        }
                        else if ( checkId == 2) {
                            viewModel.account.phone = editTextProfile.text.toString().trim()
                            DataStore.setPhoneAccount(idUser,viewModel.account.phone)
                        }
                        else if ( checkId == 3) {
                            viewModel.account.email = editTextProfile.text.toString().trim()
                            DataStore.setEmailAccount(idUser,viewModel.account.email)
                        }
                        Toast.makeText(this@ProfileActivity, "Successful", Toast.LENGTH_SHORT)
                                .show()
                        binding.invalidateAll()
                    }
                    setNegativeButton("Cancel")
                    { dialog, which_ ->
                        Toast.makeText(this@ProfileActivity, "", Toast.LENGTH_SHORT).show()
                    }
                    setView(dialogLayout)
                    show()
                }
            }
        }
}




