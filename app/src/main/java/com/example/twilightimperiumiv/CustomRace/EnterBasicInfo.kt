package com.example.twilightimperiumiv.CustomRace

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlin.math.log

class EnterBasicInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_one)

        saveButFragOne.setOnClickListener {
            val list : ArrayList<BasicInfo> = arrayListOf()
            list.add(createBasicInfo())

            var intent = Intent(this, EnterFactionAbilities::class.java).apply {
                putExtra("BASIC_INFO", Gson().toJson(list))
            }
            startActivity(intent)
        }
    }

    private fun makeString() : String {
        return Gson().toJson(createBasicInfo())

    }


    fun saveBasicInfo() {
        val gson = Gson()

        val basicInfoGson = gson.toJson(createBasicInfo())
        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()
        editor.putString("basic_info",basicInfoGson)
        editor.apply()
        Log.d("Message", "Tried to save M'lord")

    }

    private fun createBasicInfo() : BasicInfo {
        return BasicInfo (raceNameEditView?.text.toString(),
                    planetNameEditView?.text.toString(),
                    planetResourcesEditText?.text.toString(),
                    planetInfluenceEditView?.text.toString(),
                    loreEditText?.text.toString())


        }
        //can call this function anytime we want to update the saved fields
        private fun checkFieldsAreFilled(vararg input : String) : Boolean {
            if(input.equals("")) {
                return false
            }
            return true
        }
    }



