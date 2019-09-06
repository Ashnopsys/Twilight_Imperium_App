package com.example.twilightimperiumiv.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.twilightimperiumiv.R
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*


/**
 * A simple [Fragment] subclass.
 */
class FragmentTwo : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_two, container, false)

        var increment : Int = 1
        view.addFactionAbility.setOnClickListener(){
            var idpartTwo = 1
            val abilityNameHead = TextView(this.context); abilityNameHead.setText("Ability Name")
            factionAbilitiesLinearLayout.addView(abilityNameHead)

            val abilityName =  EditText(this.context);
            abilityName.id = (increment.toString() + idpartTwo.toString()).toInt() //This disgusts me
            factionAbilitiesLinearLayout.addView(abilityName)

            val abilityDescHead = TextView(this.context); abilityDescHead.setText("Ability Description")
            factionAbilitiesLinearLayout.addView(abilityDescHead)

            val abilityDescription = EditText(this.context)
            abilityDescription.id = (increment.toString() + idpartTwo.inc().toString()).toInt()
            factionAbilitiesLinearLayout.addView(abilityDescription)

            System.out.println("AbilityNameID = ${abilityName.id},AbilityDescriptionID =  ${abilityDescription.id}")

            increment = increment.inc()
     //      Log.d("Increment", abilityDescription.id.toString())
        }
        /*
        SOLUTION
        Get the id for the factionAbility when it is created and add it to a list, cycle through
        and add them to a list for the race.
         */

    return view    }
}