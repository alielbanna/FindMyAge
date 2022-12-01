package com.alilbanna.findmyage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        buGetAge.setOnClickListener {
//            // when button is clicked
//
//
//        }
    }


    fun  buClickEvent(view:View){
        val yearOfBirth:Int = etUserYearOfBirth.text.toString().toInt()
        val currentYear =Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - yearOfBirth
        tvShowAge.text = "Your Age is $age years "
    }
}