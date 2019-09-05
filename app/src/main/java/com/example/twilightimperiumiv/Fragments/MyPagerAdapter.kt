package com.example.twilightimperiumiv.Fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentTabHost
import com.example.twilightimperiumiv.Fragments.FragmentOne
import com.example.twilightimperiumiv.Fragments.FragmentThree
import com.example.twilightimperiumiv.Fragments.FragmentTwo

class MyPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentOne()
            }
            1 -> FragmentTwo()
            else -> {
                return FragmentThree()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Basic Info"
            1 -> "Abilities"
            else -> {
                return "Ships"
            }
        }
    }

}