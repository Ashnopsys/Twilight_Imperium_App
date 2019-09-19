package com.example.twilightimperiumiv.Fragments

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.example.twilightimperiumiv.CustomRace.CustomRace
import com.example.twilightimperiumiv.Fragments.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_tab_create_race.*
import kotlinx.android.synthetic.main.fragment_one.*

class Communicator : ViewModel(){

    val message = MutableLiveData<Any>()

    fun setMsgCommunicator(msg:String){
        message.setValue(msg)
    }
}