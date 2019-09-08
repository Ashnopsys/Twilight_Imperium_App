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

        view.hitThis.setOnClickListener() {
            fleet = createFleet(ShipType.DESTROYER)

            for (ship in fleet) {
                Log.d("Ships", "${ship.shipTypeAsString} is Custom: ${ship.isCustomShip.toString()}")
            }
        }
        /*
        If imageButton is selected set race isCustomShip to True else false
         */
        return view
    }


    fun createFleet(vararg shiptype: ShipType): ArrayList<Ship> {
        /*
        Create all the ships, if any of the created ships match any of the passed
        in strings then set that ship to customisable
         */

        var fleet: ArrayList<Ship> = ArrayList()

        for (ship in ShipType.values()) {
            var isCustom: Boolean = false
            if (shiptype.toString().equals(ship.toString())) {
                isCustom = true
            }


            var newShip = Ship(ship, isCustom, fleet)
            fleet.add(newShip)


//            if (ship == shiptype) {
//                isCustom = true
//                var newShip = Ship(ship, isCustom, fleet)
//                fleet.add(newShip)
//
//            }
            fleet.add(newShip)

        }


        return fleet //TODO change this value and implement method
    }

}