package com.cscorner.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner=findViewById<Spinner>(R.id.spinner_security)
        val data= arrayOf<String>("123","567","876","321")
        val adapterView= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView

        val spinner2=findViewById<Spinner>(R.id.spinner_state)
        val data2= arrayOf<String>("Bihar","West Bengal","Delhi","Punjab")
        val adapterView2= ArrayAdapter(this,R.layout.spinner,data2)
        spinner2.adapter=adapterView2

        val spinner3=findViewById<Spinner>(R.id.spinner_country)
        val data3= arrayOf<String>("India","USA","Nepal","Africa")
        val adapterView3= ArrayAdapter(this,R.layout.spinner,data3)
        spinner3.adapter=adapterView3

        val spinner4=findViewById<Spinner>(R.id.spinner_city)
        val data4= arrayOf<String>("Kolkata","Patna","Hooghly","Bally")
        val adapterView4= ArrayAdapter(this,R.layout.spinner,data4)
        spinner4.adapter=adapterView4


        val spinner5=findViewById<Spinner>(R.id.spinner_postal)
        val data5= arrayOf<String>("123","567","876","321")
        val adapterView5= ArrayAdapter(this,R.layout.spinner,data5)
        spinner5.adapter=adapterView5







    }
}