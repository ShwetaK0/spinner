package com.cscorner.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner=findViewById<Spinner>(R.id.spinner)
        val data= arrayOf<String>("10-15","15-20","20-30","30-40")
        val adapterView= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView

        val spinner2=findViewById<Spinner>(R.id.spinner2)
        val data1= arrayOf<String>("Panta","Kolkata","Hooghly")
        val adapterView1= ArrayAdapter(this,R.layout.spinner,data1)
        spinner2.adapter=adapterView1

        val spinner3=findViewById<Spinner>(R.id.spinner3)
        val data2= arrayOf<String>("Bihar","West Bengal","Rachi","Delhi")
        val adapterView2= ArrayAdapter(this,R.layout.spinner,data2)
        spinner3.adapter=adapterView2

        val spinner4=findViewById<Spinner>(R.id.spinner4)
        val data3= arrayOf<String>("India","USA","China","Nepal")
        val adapterView3= ArrayAdapter(this,R.layout.spinner,data3)
        spinner4.adapter=adapterView3





    }
}