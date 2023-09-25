package com.cscorner.newpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  spinnerId=findViewById<Spinner>(R.id.spinner)
        val data= arrayOf<String>("Bihar","Delhi","West Bengal","Pune")
        val adapterView=ArrayAdapter(this,R.layout.spinner_layout,data)

        spinnerId.adapter=adapterView

    }
}