package com.example.twilightimperiumiv.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twilightimperiumiv.CustomRace.Ships.Ship
import com.example.twilightimperiumiv.CustomRace.Ships.ShipType
import com.example.twilightimperiumiv.R
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentThree : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_three, container, false)
        var fleet: ArrayList<Ship> = ArrayList()
        val destroyer = Ship(ShipType.DESTROYER, false, fleet)


        //TODO add clicklistener to image in carosel which will correspond to a ship being custom
        view.hitThis.setOnClickListener() {
            fleet = createFleet()

            for (ship in fleet) {
                Log.d("Ships", "${ship.shipTypeAsString} is Custom: ${ship.isCustomShip.toString()}")
            }
        }
        /*
        If imageButton is selected set race isCustomShip to True else false
         */
        return view
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

    fun customiseShipStats(pictureID : String, fleetList : ArrayList<Ship>) : ArrayList<Ship>{

        for(ship in fleetList) {

        }

        return fleetList
    }


}

