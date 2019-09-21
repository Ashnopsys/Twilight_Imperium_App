package com.example.twilightimperiumiv.CustomRace

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_one.*

class EnterBasicInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_one)

        saveButFragOne.setOnClickListener {
            val list : ArrayList<BasicInfo> = arrayListOf()
            list.add(createBasicInfo())

            var intent = Intent(this, EnterFactionAbilities::class.java).apply {
                putExtra("BASIC_INFO", Gson().toJson(createBasicInfo()))
            }
            startActivity(intent)
        }
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



