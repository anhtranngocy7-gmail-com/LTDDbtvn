package com.laptrinhdidong.nhom3.btvntuan1
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
                var check_login : Int =viewModel.checkLogin(binding)
                        if(check_login!=-1)
                        {
                            val intent = Intent(this@LoginActivity,ProfileActivity::class.java)
                            val bundle = Bundle()
                            val userInformation = UserInformationData(index = check_login)
                            bundle.putParcelable("userInformation", userInformation)
                            intent.putExtras(bundle)
                            startActivity(intent)
                        }else
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


