package com.example.twilightimperiumiv.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.FactionAbility
import com.example.twilightimperiumiv.R
import kotlinx.android.synthetic.main.faction_ability.view.*
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*


/**
 * A simple [Fragment] subclass.
 */
class FragmentTwo : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_two, container, false)

        var increment : Int = 0
        val abilities = arrayListOf<FactionAbility>()
            view.addFactionAbility.setOnClickListener() {
                val factionAbilityLimit = 3
                if(increment < factionAbilityLimit) {
                    var idNumber = 1
                    factionAbilitiesLinearLayout.addView(createFactionAbilityBox(inflater, container))
                    val abilityName = factionAbilitiesLinearLayout.abilityNameEditText.toString()
                    val abilityDescription = factionAbilitiesLinearLayout.abilityDescriptionEditText.toString()
                    //need to add id to each ability. This needs changed as it will save blank fields
                   // System.out.println("AbilityNameID = ${abilityName.id},AbilityDescriptionID =  ${abilityDescription.id}")
                    increment = increment.inc()
                    //      Log.d("Increment", abilityDescription.id.toString())
                } else {
                    val toast = Toast.makeText(view.context, "You already have 3 abilities!", Toast.LENGTH_LONG)
                    toast.show()                  }

        }
        /*
        SOLUTION
        Get the id for the factionAbility when it is created and add it to a list, cycle through
        and add them to a list for the race.
         */

    return view
    }

    private fun createFactionAbilityBox(inflater: LayoutInflater, container : ViewGroup?) :View {
        return inflater.inflate(R.layout.faction_ability, container, false)
    }
}