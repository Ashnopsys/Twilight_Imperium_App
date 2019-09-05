package com.example.twilightimperiumiv.Fragments

import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.twilightimperiumiv.CustomRace.CustomRace
import com.example.twilightimperiumiv.R
import com.example.twilightimperiumiv.RaceList
import com.example.twilightimperiumiv.TabCreateRace
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*


/**
 * A simple [Fragment] subclass.
 */

class FragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_one, container, false)

        view.raceNameFragOne.setOnClickListener {
            Log.d("AAAA","Hello, button pressed")
        }

        return view    }

    fun fragments() {

    }
}