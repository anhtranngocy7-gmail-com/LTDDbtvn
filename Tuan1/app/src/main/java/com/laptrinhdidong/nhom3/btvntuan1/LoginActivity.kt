package com.laptrinhdidong.nhom3.btvntuan1
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_login_an)
        var btn_login=findViewById<Button>(R.id.btn_login);
        var et_email_login=findViewById<EditText>(R.id.et_email_login);
        var et_pass_login=findViewById<EditText>(R.id.et_pass_login);
        btn_login.setOnClickListener{
            if(et_email_login.text.toString()=="ronaldo@gmail.com"&&et_pass_login.text.toString()=="123456")
            {
                var intent: Intent =Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}