package com.example.databindingfifecyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingfifecyle.databinding.ActivityMainBinding

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.sum = 0

        binding.btnClick.setOnClickListener {
            val numA = binding.edtNumberA.text.toString().toInt()
            val numB = binding.edtNumberB.text.toString().toInt()

            binding.sum = numA + numB
        }
    }
}