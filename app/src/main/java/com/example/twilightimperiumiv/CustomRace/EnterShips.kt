package com.example.twilightimperiumiv.CustomRace

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_one.*

class EnterShips  : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.fragment_one)
    val customRace = CustomRace()

}
}