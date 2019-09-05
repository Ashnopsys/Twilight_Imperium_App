package com.example.twilightimperiumiv

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.example.twilightimperiumiv.CustomRace.CustomRace
import com.example.twilightimperiumiv.Fragments.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_tab_create_race.*
import kotlinx.android.synthetic.main.fragment_one.*

class TabCreateRace : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_create_race)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)


        val raceList: List<CustomRace>
        raceList = RaceList.getFromPrefs(this)


    }
}