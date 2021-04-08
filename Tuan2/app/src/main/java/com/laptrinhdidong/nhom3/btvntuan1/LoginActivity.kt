package com.laptrinhdidong.nhom3.btvntuan1
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText

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
            if(et_email_login.text.toString()=="ronaldo@gmail.com"&&et_pass_login.text.toString()=="123456")
            {
                Log.e("LoginActivity", "Login Activity _ Login Success")
                val intent = Intent(this@LoginActivity,ProfileActivity::class.java)
                val bundle = Bundle()
                val userInformation = UserInformationData(email = et_email_login.text.toString(), fullName = "Cristiano Ronaldo", phoneNumber = "+ 0399 371 485")
                bundle.putParcelable("userInformation", userInformation )
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }


}


