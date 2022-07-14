package com.example.databindingfifecyle.custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingfifecyle.R
import com.example.databindingfifecyle.databinding.ActivityCustomBinding

class CustomActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingCustomBinding: ActivityCustomBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_custom)
        super.onCreate(savedInstanceState)


        bindingCustomBinding.btnSubmit.setOnClickListener {
            val age = bindingCustomBinding.edtAge.text.toString().toInt()
            bindingCustomBinding.age = age
        }
    }
}