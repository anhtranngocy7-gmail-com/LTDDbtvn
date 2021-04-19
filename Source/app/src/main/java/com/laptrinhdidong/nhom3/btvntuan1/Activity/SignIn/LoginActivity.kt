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
                    viewModel.account.email=etEmailLogin.text.toString().trim()
                    viewModel.account.password=etPassLogin.text.toString().trim()
                    account=viewModel.account
                    
                    var indexTemp : Int =0
                    var checkTrue: Int = 0;
                    for(item in DataStore.getListAccount())
                    {
                        if(account?.email.toString().trim()==item.email&&account?.password.toString().trim()==item.password)
                        {
                            Log.e("LoginActivity", "Login Activity _ Login Success")
                            Toast.makeText(this@LoginActivity, "Login Success", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                            val bundle = Bundle()
                            val userInformation = UserInformationData(index = indexTemp,email = item.email, fullName = item.fullname.trim(), phoneNumber = item.phone)
                            bundle.putParcelable("userInformation", userInformation)
                            intent.putExtras(bundle)
                            checkTrue = 1;
                            startActivity(intent)
                        }
                        indexTemp++
                    }
                     if (checkTrue ==0)
                        {
                            Toast.makeText(this@LoginActivity, "Please try again", Toast.LENGTH_SHORT).show()
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

