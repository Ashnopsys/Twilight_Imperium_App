package com.example.twilightimperiumiv.CustomRace

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.FactionAbility
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.faction_ability.view.*
import kotlinx.android.synthetic.main.fragment_two.*

class EnterFactionAbilities : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_two)

        var increment = 0
        val factionAbilityNameList = arrayListOf<EditText>()
        val factionAbilityDescriptionList = arrayListOf<EditText>()

        addFactionAbility.setOnClickListener() {
            val factionAbilityLimit = 3
            if(increment < factionAbilityLimit) {
                val view = createFactionAbilityBox(factionAbilitiesLinearLayout)
                view.id = increment
                factionAbilitiesLinearLayout.addView(view)

                val abilityName = factionAbilitiesLinearLayout.abilityNameEditText
                val abilityDescription = factionAbilitiesLinearLayout.abilityDescriptionEditText

                factionAbilityNameList.add(abilityName)
                factionAbilityDescriptionList.add((abilityDescription))

                increment = increment.inc()

                val removeButton = Button(this)
                removeButton.text = "Remove Ability"
                removeButton.setOnClickListener() {
                    factionAbilitiesLinearLayout.removeView(view)
                    factionAbilitiesLinearLayout.removeView(removeButton)
                    //TODO remove the edittexts from the lists too

                    increment = increment - 1
                    val toast = Toast.makeText(applicationContext, view.id.toString(), Toast.LENGTH_LONG)
                    toast.show()
                }
                factionAbilitiesLinearLayout.addView(removeButton)
            } else {
                val toast = Toast.makeText(applicationContext, "You already have 3 abilities!", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        shipsButton.setOnClickListener() {

            var from = intent.extras.getString("CUSTOM_RACE")
            if (from.length >= 0) {
                val customRace : CustomRace = Gson().fromJson(from, object : TypeToken<CustomRace>(){}.type)
                customRace.setFactionAbility(makeFactionAbilities(factionAbilityNameList, factionAbilityDescriptionList))
            }
        }
    }

    private fun makeFactionAbilities(names : List<EditText>, descriptions : List<EditText>) : ArrayList<FactionAbility> {
        val listOfFactionAbilities = arrayListOf<FactionAbility>()
        if(names.size != 0) {
            for (i in names.indices) {
                val factionAbility = FactionAbility(names[i].text.toString(), descriptions[i].text.toString())
                listOfFactionAbilities.add(factionAbility)
            }
        }
        return listOfFactionAbilities
    }

    private fun removeFactionAbility(id: Int, view: View) {

    }

    private fun createFactionAbilityBox(container : ViewGroup?) : View {
        val inflater:LayoutInflater = LayoutInflater.from(applicationContext)
        return inflater.inflate(R.layout.faction_ability, container, false)
    }

}
