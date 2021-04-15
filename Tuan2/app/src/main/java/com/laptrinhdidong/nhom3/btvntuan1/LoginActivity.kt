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
    private var account : Account = Account("Default fullname", "default email", "Default password", "000000000")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.nhom3_an_login)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.account = viewModel.account

        binding.apply {

            btn_login.setOnClickListener {
<<<<<<< HEAD
//          toast để test lấy data
                Toast.makeText(this@LoginActivity,DataStore.getListAccount()[0].password.trim(),Toast.LENGTH_SHORT).show()
                Log.e("LoginActivity", DataStore.getListAccount()[0].password.trim())
                if (account?.email == DataStore.getListAccount()[0].email.trim() && account?.password == DataStore.getListAccount()[0].password.trim()) {
                    Log.e("LoginActivity", "Login Activity _ Login Success")
                    val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                    val bundle = Bundle()
                    val userInformation = UserInformationData(email = account?.email, fullName = DataStore.getListAccount()[0].fullname.trim(), phoneNumber = DataStore.getListAccount()[0].phone.trim())
=======

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
>>>>>>> 0e61ed62226dc7a9e482de448711bd93bda2dc4f
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


