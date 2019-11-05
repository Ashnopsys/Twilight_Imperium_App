package com.example.twilightimperiumiv.CustomRace

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.twilightimperiumiv.CustomRace.Ships.Ship
import com.example.twilightimperiumiv.CustomRace.Ships.ShipType
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_three.*



class EnterShips  : AppCompatActivity() {
    lateinit var txt_help_gest : View
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.fragment_three)
    val customRace = CustomRace()
    val inflater: LayoutInflater = LayoutInflater.from(applicationContext)
    txt_help_gest = inflater.inflate(R.layout.create_cruiser, ships_layout, false)
    ships_layout.addView(txt_help_gest)
// hide until its title is clicked
    txt_help_gest.visibility = View.GONE

    val from = intent.extras.getString("CUSTOM_RACE")

    //TODO need to figure out how to apply clicked method to each of the buttons without spaghetti code
}
    fun createFleet(): ArrayList<Ship> {
        /*
        Create all the ships with default stats. Will create another method to change stats
        based on selected ship
         */
        var DEFAULT_CUSTOM_STATS = false
        var fleet: ArrayList<Ship> = ArrayList()

        for (ship in ShipType.values()) {
            var newShip = Ship(ship, DEFAULT_CUSTOM_STATS , fleet)
            fleet.add(newShip)
        }
        return fleet
    }

    fun toggle_contents(view : View) {

        txt_help_gest.visibility = if (txt_help_gest.isShown)
            View.GONE
        else
            View.VISIBLE
    }
}