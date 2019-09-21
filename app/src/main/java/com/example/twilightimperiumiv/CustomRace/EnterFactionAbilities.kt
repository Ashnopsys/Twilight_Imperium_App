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
import kotlinx.android.synthetic.main.faction_ability.view.*
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class EnterFactionAbilities : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_two)

        var from = intent.extras.getString("BASIC_INFO")
        Log.e("HERE", "MADE IT")
        if (from.length >= 0) {
            val basicInfo : BasicInfo = Gson().fromJson(from, object : TypeToken<BasicInfo>(){}.type)
            Log.e("Message", basicInfo.name)
        }

        var increment : Int = 0
        val abilities = arrayListOf<FactionAbility>()
        addFactionAbility.setOnClickListener() {
            val factionAbilityLimit = 3
            if(increment < factionAbilityLimit) {
                var idNumber = 1
                factionAbilitiesLinearLayout.addView(createFactionAbilityBox(factionAbilitiesLinearLayout))
                val abilityName = factionAbilitiesLinearLayout.abilityNameEditText.toString()
                val abilityDescription = factionAbilitiesLinearLayout.abilityDescriptionEditText.toString()
                //need to add id to each ability. This needs changed as it will save blank fields
                // System.out.println("AbilityNameID = ${abilityName.id},AbilityDescriptionID =  ${abilityDescription.id}")
                increment = increment.inc()
                //      Log.d("Increment", abilityDescription.id.toString())
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
