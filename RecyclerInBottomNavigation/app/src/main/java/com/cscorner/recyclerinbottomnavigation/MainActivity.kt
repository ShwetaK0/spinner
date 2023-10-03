package com.cscorner.recyclerinbottomnavigation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)

        loadFragment(HomeFragment())

        buttomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->loadFragment(HomeFragment())
                R.id.people->loadFragment(PeopleFragment())
                R.id.setting->loadFragment(SettingFragment())
            }
            true
        }
    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment).commit()
    }
}