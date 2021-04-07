package com.laptrinhdidong.nhom3.btvntuan1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_profile_an)
        val TextviewEmail = findViewById<TextView>(R.id.txt_Email)
        val TextviewFullname = findViewById<TextView>(R.id.txt_Fullname)
        val TextviewPhonenumber = findViewById<TextView>(R.id.txt_Phonenumber)
        val TextviewEditprofile = findViewById<TextView>(R.id.txt_EditProfile)
        val bundle = intent.extras
        bundle?.let {
            val userInformation = bundle.getParcelable<UserInformation>("userInformation")
            TextviewEmail.text = String.format("%s",userInformation?.email)
            TextviewFullname.text = String.format("%s",userInformation?.fullName)
            TextviewPhonenumber.text = String.format("%s",userInformation?.phoneNumber)
        }

        TextviewEditprofile.setOnClickListener(
            
        )
    }
}