package com.example.twilightimperiumiv

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.twilightimperiumiv.Fragments.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_tab_create_race.*

class TabCreateRace : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_create_race)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
    }
}