package com.laptrinhdidong.nhom3.btvntuan1
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("LoginActivity", "Login Activity _ onCreate")
        setContentView(R.layout.nhom3_an_login)
        var btn_login=findViewById<Button>(R.id.btn_login);
        var et_email_login=findViewById<EditText>(R.id.et_email_login);
        Log.e("LoginActivity", "Login Activity _ Email: " + et_email_login.text.toString())
        var et_pass_login=findViewById<EditText>(R.id.et_pass_login);
        Log.e("LoginActivity", "Login Activity _ Email: " + et_pass_login.text.toString())
        btn_login.setOnClickListener{
//          toast để test lấy data
            Toast.makeText(this,DataStore.email.trim(),Toast.LENGTH_SHORT).show()
            if(et_email_login.text.toString()==DataStore.email.trim()&&et_pass_login.text.toString()==DataStore.password.trim())
            {
                Log.e("LoginActivity", "Login Activity _ Login Success")
                val intent = Intent(this@LoginActivity,ProfileActivity::class.java)
                val bundle = Bundle()
                val userInformation = UserInformationData(email = et_email_login.text.toString(), fullName = DataStore.fullname.trim(), phoneNumber = "+ 0399 371 485")
                bundle.putParcelable("userInformation", userInformation )
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }


}


