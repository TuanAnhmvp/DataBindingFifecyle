package com.example.databindingfifecyle.dataBViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingfifecyle.R
import com.example.databindingfifecyle.databinding.ActivityDataBinVmactivityBinding

class DataBinVMActivity : AppCompatActivity() {

    // khoi tao 1 doi tuong viewmodel
    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this)[UserViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingDataBinVmactivityBinding:ActivityDataBinVmactivityBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_data_bin_vmactivity)
        super.onCreate(savedInstanceState)

        bindingDataBinVmactivityBinding.lifecycleOwner = this
        bindingDataBinVmactivityBinding.viewModel = viewModel
        viewModel.setFirstName("haha")
        viewModel.setLastName("huhu")
    }
}