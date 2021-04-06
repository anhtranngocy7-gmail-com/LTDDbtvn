package com.laptrinhdidong.nhom3.btvntuan1
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.nhom3_login_an.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nhom3_login_an)
        btn_login.setOnClickListener{
            if(et_email_login.text.toString()=="ronaldo@gmail.com"&&et_pass_login.text.toString()=="123456")
            {
                var intent: Intent =Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}