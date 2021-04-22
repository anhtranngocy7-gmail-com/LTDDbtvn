package com.laptrinhdidong.nhom3.btvntuan1.Activity.Profile
import android.content.Context
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.laptrinhdidong.nhom3.btvntuan1.*
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnProfileBinding

class DialogEdit(context: Context) : AlertDialog(context) {
    fun DialogProfileF(TextviewDPF: TextView, title:String,binding: Nhom3AnProfileBinding,viewModel: ProfileViewModel) {
        TextviewDPF.setOnClickListener {
            val builder = AlertDialog.Builder(context)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.nhom3_anh_dialog_profile, null)
            val editTextProfile = dialogLayout.findViewById<EditText>(R.id.edit_username)
            with(builder) {
                setTitle(title)
                setPositiveButton("Apply")
                { dialog, which_ ->
                    if (title == "Name" ) {
                        viewModel.setFullName(editTextProfile.text.toString().trim())
                    }
                    else if ( title == "Phone Number") {
                        viewModel.setPhone(editTextProfile.text.toString().trim())
                    }
                    else if ( title == "Email") {
                        viewModel.setEmail(editTextProfile.text.toString().trim())
                    }
                    Toast.makeText(context, "Successful", Toast.LENGTH_SHORT).show()
                    binding.invalidateAll()
                }
                setNegativeButton("Cancel")
                { dialog, which_ ->
                 Toast.makeText(context, "", Toast.LENGTH_SHORT).show()
                }
                setView(dialogLayout)
                show()
            }
        }
    }
}