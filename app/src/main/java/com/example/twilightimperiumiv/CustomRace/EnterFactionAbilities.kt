package com.example.twilightimperiumiv.CustomRace

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.FactionAbility
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.faction_ability.*
import kotlinx.android.synthetic.main.faction_ability.view.*
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class EnterFactionAbilities : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_two)

        var from = intent.extras.getString("CUSTOM_RACE")
        Log.e("HERE", "MADE IT")
        if (from.length >= 0) {
            val customRace : CustomRace = Gson().fromJson(from, object : TypeToken<CustomRace>(){}.type)
            Log.e("Message", customRace.name)
        }

        var increment : Int = 0
        val abilities = arrayListOf<FactionAbility>()
        val factionAbilityList = arrayListOf<FactionAbility>()
        addFactionAbility.setOnClickListener() {
            val factionAbilityLimit = 3
            if(increment < factionAbilityLimit) {
                val view = createFactionAbilityBox(factionAbilitiesLinearLayout)
                factionAbilitiesLinearLayout.addView(view)

                val abilityName = factionAbilitiesLinearLayout.abilityNameEditText.toString()


                val abilityDescription = factionAbilitiesLinearLayout.abilityDescriptionEditText.toString()
                //need to add id to each ability. This needs changed as it will save blank fields
                increment = increment.inc()

                factionAbilityList.add(FactionAbility(abilityName, abilityDescription, view))
                //pass in view too so that it can be removed with delete button

                removeButton.setOnClickListener() {
                    val toast = Toast.makeText(applicationContext, factionAbilitiesLinearLayout.abilityNameEditText.id.toString(), Toast.LENGTH_LONG)
                    toast.show()
                    //doesn't work yet. Need to implement for each button
                }

                } else {
                val toast = Toast.makeText(applicationContext, "You already have 3 abilities!", Toast.LENGTH_LONG)
                toast.show()
            }
        }
    }
    private fun createFactionAbilityBox(container : ViewGroup?) : View {
        val inflater:LayoutInflater = LayoutInflater.from(applicationContext)
        return inflater.inflate(R.layout.faction_ability, container, false)
    }
}
