package com.example.twilightimperiumiv.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twilightimperiumiv.R


/**
 * A simple [Fragment] subclass.
 */
class FragmentThree : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_three, container, false)

        /*
        If imageButton is selected set race isCustomShip to True else false
         */
        return view
    }
}