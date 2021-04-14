package com.laptrinhdidong.nhom3.btvntuan1
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnLoginBinding
import kotlinx.android.synthetic.main.nhom3_an_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : Nhom3AnLoginBinding
    private lateinit var viewModel: LoginViewModel
    private var account : Account = Account("Default fullname", "", "Default password", "000000000")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.nhom3_an_login)
<<<<<<< HEAD
//        var binding=DataBindingUtil<Button>(R.id.btn_login);
//        binding.account.email =
//        Log.e("LoginActivity", "Login Activity _ Email: " + binding.account.email)
//        var et_pass_login=findViewById<EditText>(R.id.et_pass_login);
//        Log.e("LoginActivity", "Login Activity _ Email: " + binding.account.password)
        Log.e("LoginActivity", "Login Activity _ Email: " + binding?.account?.email)
//        var et_pass_login=findViewById<EditText>(R.id.et_pass_login);
        Log.e("LoginActivity", "Login Activity _ Email: " + binding?.account?.password)
=======
>>>>>>> c33d69068565823a9b14cf80b50202a2402886bf
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.account = viewModel.account

        binding.apply {

            btn_login.setOnClickListener {

                account?.email = et_email_login.text.toString().trim()
                account?.password = et_pass_login.text.toString().trim()

                Log.e("LoginActivity",DataStore.account.email.trim())
                Log.e("LoginActivity",DataStore.account.password.trim())
                account?.email?.let { it1 -> Log.e("LoginActivity", it1) }
                account?.password?.let { it1 -> Log.e("LoginActivity", it1) }

                if (account?.email == DataStore.account.email.trim() && account?.password == DataStore.account.password.trim()) {
                    Toast.makeText(this@LoginActivity, "LOGIN SUCCESS", Toast.LENGTH_SHORT)
                    Log.e("LoginActivity", "Login Activity _ Login Success")
                    val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                    val bundle = Bundle()
                    val userInformation = UserInformationData(email = account?.email, fullName = DataStore.account.fullname.trim(), phoneNumber = "+ 0399 371 485")
                    bundle.putParcelable("userInformation", userInformation)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                invalidateAll()
            }
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
}


