package com.example.databindingfifecyle.custom

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:age")
fun checkAge(view: View, age: Int){
    val txt = view as TextView
    when{
        age < 18 ->{
            txt.text = ("You are young")
        }
        age > 18 ->{
            txt.text = ("TuanAnh")
        }
        else ->{
            txt.text = ("Empty")
        }
    }

}