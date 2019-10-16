package com.example.twilightimperiumiv.CustomRace

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import com.example.twilightimperiumiv.CustomRace.Ships.Ship
import com.example.twilightimperiumiv.CustomRace.Ships.ShipType
import com.example.twilightimperiumiv.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_one.*

class EnterShips  : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.fragment_three)
    val customRace = CustomRace()


    val from = intent.extras.getString("CUSTOM_RACE")


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
}