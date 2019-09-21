package com.example.twilightimperiumiv.CustomRace

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken

class EnterFactionAbilities : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_two)

        var from = intent.extras.getString("BASIC_INFO")
        Log.e("HERE", "MADE IT")
        if (from.length >= 0) {
            Log.e("HERE", "MADE IT TWICE")

            val parser = JsonParser()
        //    val array = parser.parse(from).asString
            Log.e("Message", "AAAAAAAAAAAAAAAAAAH")

            val basicInfo : BasicInfo = Gson().fromJson(from, object : TypeToken<BasicInfo>(){}.type)
            Log.e("Message", basicInfo.toString())

            Log.e("Message", basicInfo.name)

        }

    }
}
