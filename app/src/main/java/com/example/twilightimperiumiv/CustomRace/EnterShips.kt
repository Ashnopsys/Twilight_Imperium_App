package com.example.twilightimperiumiv.CustomRace

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import com.example.twilightimperiumiv.CustomRace.Ships.Ship
import com.example.twilightimperiumiv.CustomRace.Ships.ShipType
import kotlinx.android.synthetic.main.fragment_three.*
import com.example.twilightimperiumiv.Fragments.FX


class EnterShips  : AppCompatActivity() {
    lateinit var txt_help_gest : View
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(com.example.twilightimperiumiv.R.layout.fragment_three)
    val customRace = CustomRace()
    val inflater: LayoutInflater = LayoutInflater.from(applicationContext)
    txt_help_gest = inflater.inflate(com.example.twilightimperiumiv.R.layout.create_cruiser, carrier_layout, false)
    carrier_layout.addView(txt_help_gest)
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

    fun toggle_contents(v: View) {
        if (txt_help_gest.isShown) {
            FX.slide_up(this, txt_help_gest)
            //TODO fix slide up
            txt_help_gest.visibility = View.GONE
        } else {
            txt_help_gest.visibility = View.VISIBLE
            FX.slide_down(this, txt_help_gest)
        }
    }
}

