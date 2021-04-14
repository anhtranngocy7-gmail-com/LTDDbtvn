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
<<<<<<< HEAD

class LoginActivity : AppCompatActivity() {
=======
class LoginActivity : AppCompatActivity() { 
>>>>>>> fcef645692a0517472c739a73612d60001839ae7
    private lateinit var binding : Nhom3AnLoginBinding
    private lateinit var viewModel: LoginViewModel
    private var account : Account = Account("Default fullname", "Default email", "Default password","Default phone")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.nhom3_an_login)
<<<<<<< HEAD
=======
//        var binding=DataBindingUtil<Button>(R.id.btn_login);
//        binding.account.email =
        Log.e("LoginActivity", "Login Activity _ Email: " + binding?.account?.email)
//        var et_pass_login=findViewById<EditText>(R.id.et_pass_login);
        Log.e("LoginActivity", "Login Activity _ Email: " + binding?.account?.password)
>>>>>>> fcef645692a0517472c739a73612d60001839ae7
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.account = viewModel.account

        binding.apply {

            btn_login.setOnClickListener {
<<<<<<< HEAD

                account?.email = et_email_login.text.toString().trim()
                account?.password = et_pass_login.text.toString().trim()

                Log.e("LoginActivity", DataStore.email.trim())
                Log.e("LoginActivity", DataStore.password.trim())
                account?.email?.let { it1 -> Log.e("LoginActivity", it1) }
                account?.password?.let { it1 -> Log.e("LoginActivity", it1) }

                if (account?.email == DataStore.email.trim() && account?.password == DataStore.password.trim()) {
                    Toast.makeText(this@LoginActivity, "LOGIN SUCCESS", Toast.LENGTH_SHORT)
=======
//          toast để test lấy data
                Toast.makeText(this@LoginActivity,DataStore.account.email.trim(),Toast.LENGTH_SHORT).show()
                Log.e("LoginActivity", DataStore.account.password.trim())
                if (account?.email == DataStore.account.email.trim() && account?.password == DataStore.account.password.trim()) {
>>>>>>> fcef645692a0517472c739a73612d60001839ae7
                    Log.e("LoginActivity", "Login Activity _ Login Success")
                    val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                    val bundle = Bundle()
                    val userInformation = UserInformationData(email = account?.email, fullName = DataStore.account.fullname.trim(), phoneNumber = DataStore.account.phone.trim())
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


