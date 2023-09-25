package com.cscorner.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner=findViewById<Spinner>(R.id.spinner)
        val data= arrayOf<String>("123","567","876","321")
        val adapterView= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView

        val spinner2=findViewById<Spinner>(R.id.spinner_state)
        val data2= arrayOf<String>("Bihar","West Bengal","Delhi","Punjab")
        val adapterView2= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView2

        val spinner3=findViewById<Spinner>(R.id.spinner3)
        val data3= arrayOf<String>("USA","India","Nepal","US")
        val adapterView3= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView3

        val spinner4=findViewById<Spinner>(R.id.spinner4)
        val data4= arrayOf<String>("Kolkata","Patna","Munger","Delhi")
        val adapterView4= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView

        val spinner5=findViewById<Spinner>(R.id.spinner5)
        val data5= arrayOf<String>("123","567","876","321")
        val adapterView5= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView5







    }
}