package com.example.twilightimperiumiv.CustomRace

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import java.util.ArrayList

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

            val basicInfo : ArrayList<BasicInfo> = Gson().fromJson(from, object : TypeToken<List<BasicInfo>>(){}.type)
            Log.e("Message", basicInfo[0].toString())

            Log.e("Message", basicInfo[0].name)

//            for (i in array) {
//                Log.e("Message", array.size().toString())
//
//                //Grab array from Json array
//                var basicInfo : ArrayList<BasicInfo> = Gson().fromJson<ArrayList<BasicInfo>>(array, object : TypeToken<List<BasicInfo>>() {}.type)
//                for (i in basicInfo) {
//                    val test : BasicInfo = i
//                    Log.e("Message", i.name)
//
//                }
////                    val name = Gson().fromJson(basicInfo, BasicInfo.class)
////                Log.e("Message", name)
//            }
        }

    }
}
