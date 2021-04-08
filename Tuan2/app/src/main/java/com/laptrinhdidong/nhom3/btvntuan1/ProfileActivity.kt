package com.laptrinhdidong.nhom3.btvntuan1

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.nhom3_anh_vefificationcode.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_an_profile)
        val TextviewEmail = findViewById<TextView>(R.id.txt_Email)
        val TextviewFullname = findViewById<TextView>(R.id.txt_Fullname)
        val TextviewPhonenumber = findViewById<TextView>(R.id.txt_Phonenumber)
        val ButtonEditprofile = findViewById<Button>(R.id.bt_EditProfile)

        val bundle = intent.extras
        bundle?.let {
            val userInformation = bundle.getParcelable<UserInformationData>("userInformation")
            TextviewEmail.text = String.format("%s", userInformation?.email)
            TextviewFullname.text = String.format("%s", userInformation?.fullName)
            TextviewPhonenumber.text = String.format("%s", userInformation?.phoneNumber)
        }
        DialogProfileF(TextviewFullname, "Name")
        DialogProfileF(TextviewPhonenumber, "Phone Number")
        DialogProfileF(TextviewEmail,"Email")
    }

    fun DialogProfileF(TextviewDPF: TextView, title:String)
        {
            TextviewDPF.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialogLayout = inflater.inflate(R.layout.nhom3_anh_dialog_profile, null)
                val editTextProfile = dialogLayout.findViewById<EditText>(R.id.edit_username)
                with(builder) {
                    setTitle(title)
                    setPositiveButton("Apply")
                    { dialog, which_ ->
                        TextviewDPF.text = editTextProfile.text.toString()
                        Toast.makeText(this@ProfileActivity, "Successful", Toast.LENGTH_SHORT)
                            .show()
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




