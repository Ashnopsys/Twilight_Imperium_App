package com.example.twilightimperiumiv.Fragments

import android.app.Activity
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo
import com.example.twilightimperiumiv.R
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_three.view.*


/**
 * A simple [Fragment] subclass.
 */

class FragmentOne : Fragment() {

    private var model: Communicator? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        activity?.let {
            /**
             *  create view model in activity scope
             */
            model = ViewModelProviders.of(it).get(Communicator::class.java)
        }
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_one, container, false)



        return view
    }

    fun createBasicInfo() : BasicInfo {
        return BasicInfo (view?.raceNameEditView?.text.toString(),
                view?.planetNameEditView?.text.toString(),
                view?.planetResourcesEditText?.text.toString(),
                view?.planetInfluenceEditView?.text.toString(),
                view?.loreEditText?.text.toString())
        //can call this function anytime we want to update the saved fields
    }


}