package com.cscorner.spinnerproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner=findViewById<Spinner>(R.id.spinner)
        val data= arrayOf<String>("Bihar","Delhi","West Bengal","Pune")
        val adapterView= ArrayAdapter(this,R.layout.spinner_layout,data)
        spinner.adapter=adapterView



        val spinnerNew=findViewById<Spinner>(R.id.spinner_country)
        val dataList= arrayOf<String>("India","USA","Nepal","China")
        val adapterNew= ArrayAdapter(this,R.layout.spinner_layout,dataList)

        spinnerNew.adapter=adapterNew

    }
}