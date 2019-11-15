package com.example.twilightimperiumiv.CustomRace

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.example.twilightimperiumiv.CustomRace.Ships.Ship
import com.example.twilightimperiumiv.CustomRace.Ships.ShipType
import kotlinx.android.synthetic.main.fragment_three.*
import com.example.twilightimperiumiv.Fragments.FX
import com.example.twilightimperiumiv.MainActivity
import com.example.twilightimperiumiv.R
import com.example.twilightimperiumiv.RaceList
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.create_carrier.*
import kotlinx.android.synthetic.main.create_cruiser.*
import kotlinx.android.synthetic.main.create_destroyer.*
import kotlinx.android.synthetic.main.create_dreadnought.*
import kotlinx.android.synthetic.main.create_fighter.*
import kotlinx.android.synthetic.main.create_infantry.*
import kotlinx.android.synthetic.main.create_pds.*
import kotlinx.android.synthetic.main.create_warsun.*
import kotlinx.android.synthetic.main.fragment_two.*


class EnterShips : AppCompatActivity() {

    lateinit var carrier_dropdown: View
    lateinit var cruiser_dropdown: View
    lateinit var destroyer_dropdown: View
    lateinit var dreadnought_dropdown: View
    lateinit var fighter_dropdown: View
    lateinit var infantry_dropdown: View
    lateinit var pds_dropdown: View
    lateinit var warsun_dropdown: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.twilightimperiumiv.R.layout.fragment_three)
        val customRace = CustomRace()

        val inflater: LayoutInflater = LayoutInflater.from(applicationContext)

        carrier_dropdown = inflater.inflate(R.layout.create_carrier, carrier_layout, false)
        cruiser_dropdown = inflater.inflate(R.layout.create_cruiser, cruiser_layout, false)
        destroyer_dropdown = inflater.inflate(R.layout.create_destroyer, destroyer_layout, false)
        dreadnought_dropdown = inflater.inflate(R.layout.create_dreadnought, dreadnought_layout, false)
        fighter_dropdown = inflater.inflate(R.layout.create_fighter, fighter_layout, false)
        infantry_dropdown = inflater.inflate(R.layout.create_infantry, infantry_layout, false)
        pds_dropdown = inflater.inflate(R.layout.create_pds, pds_layout, false)
        warsun_dropdown = inflater.inflate(R.layout.create_warsun, warsun_layout, false)

        val ship_views = arrayOf(carrier_dropdown, cruiser_dropdown, destroyer_dropdown, dreadnought_dropdown,
                fighter_dropdown, infantry_dropdown, pds_dropdown, warsun_dropdown)
        val ship_xmls = arrayOf(R.layout.create_carrier, R.layout.create_cruiser, R.layout.create_destroyer,
                R.layout.create_dreadnought, R.layout.create_fighter, R.layout.create_infantry,
                R.layout.create_pds, R.layout.create_warsun)
        val ship_layouts = arrayOf(carrier_layout, cruiser_layout, destroyer_layout, dreadnought_layout,
                fighter_layout, infantry_layout, pds_layout, warsun_layout)

        addViews(ship_views, ship_layouts)
//            , destroyer_dropdown, dreadnought_dropdown,
//                infantry_dropdown, pds_dropdown, warsun_dropdown)


        makeAllViewsGone(ship_views)
        var racesNames = java.util.ArrayList<CustomRace>()

        saveRaceButton.setOnClickListener() {

            val from = intent.extras.getString("CUSTOM_RACE")
            val customRace : CustomRace = Gson().fromJson(from, object : TypeToken<CustomRace>(){}.type)

            if (from.length >= 0) {
                customRace.setShipSheet(createFleet())

                racesNames = RaceList.getFromPrefs(this@EnterShips)

                racesNames.add(customRace)

                val gson = Gson()
                val prefs = getSharedPreferences("prefs", Context.MODE_PRIVATE)
                val racesHistoryListToString = gson.toJson(racesNames)

                val editor = prefs.edit()
                editor.putString("history", racesHistoryListToString)
                editor.apply()




                val intent = Intent(this, MainActivity::class.java).apply {
                }
                startActivity(intent)

            }
        }

        //TODO need to figure out how to apply clicked method to each of the buttons without spaghetti code
    }

    private fun addViews(ship_views: Array<View>, ship_layouts: Array<LinearLayout>) {
        for (i in ship_views.indices) {
            ship_layouts[i].addView(ship_views[i])
        }
    }

    fun createFleet(): ArrayList<Ship> {
        var fleet: ArrayList<Ship> = ArrayList()
        //(ShipType shiptype, int cost, int combat, int move, int capacity)

        val carrier = Ship(ShipType.CARRIER, carrier_cost.toString().toInt(), carrier_combat.toString().toInt(), carrier_move.toString().toInt(), carrier_cap.toString().toInt())
        val cruiser = Ship(ShipType.CRUISER, cruiser_cost.toString().toInt(), cruiser_combat.toString().toInt(), cruiser_move.toString().toInt(), cruiser_cap.toString().toInt())
        val destroyer = Ship(ShipType.DESTROYER, destroyer_cost.toString().toInt(), destroyer_combat.toString().toInt(), destroyer_move.toString().toInt(), destroyer_cap.toString().toInt())
        val dreadnought = Ship(ShipType.DREADNOUGHT, dreadnought_cost.toString().toInt(), dreadnought_combat.toString().toInt(), dreadnought_move.toString().toInt(), dreadnought_cap.toString().toInt())
        val fighter = Ship(ShipType.FIGHTER, fighter_cost.toString().toInt(), fighter_combat.toString().toInt(), fighter_move.toString().toInt(), fighter_cap.toString().toInt())
        val infantry = Ship(ShipType.INFANTRY, infantry_cost.toString().toInt(), infantry_combat.toString().toInt(), infantry_move.toString().toInt(), infantry_cap.toString().toInt())
        val pds = Ship(ShipType.PDS, pds_cost.toString().toInt(), pds_combat.toString().toInt(), pds_move.toString().toInt(), pds_cap.toString().toInt())
        val warsun = Ship(ShipType.WARSUN, warsun_cost.toString().toInt(), warsun_combat.toString().toInt(), warsun_move.toString().toInt(), warsun_cap.toString().toInt())

        fleet.add(carrier)
        fleet.add(cruiser)
        fleet.add(destroyer)
        fleet.add(dreadnought)
        fleet.add(fighter)
        fleet.add(infantry)
        fleet.add(pds)
        fleet.add(warsun)
        return fleet
    }

    private fun makeAllViewsGone(shipViews: Array<View>) {
        for (ship in shipViews) {
            ship.visibility = View.GONE

        }
    }

    fun toggle_contents_carrier(v: View) {
        if (carrier_dropdown.isShown) {
            FX.slide_up(this, carrier_dropdown)
            //TODO fix slide up
            carrier_dropdown.visibility = View.GONE
        } else {
            carrier_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, carrier_dropdown)
        }
    }

    fun toggle_contents_cruiser(v: View) {
        if (cruiser_dropdown.isShown) {
            FX.slide_up(this, cruiser_dropdown)
            //TODO fix slide up
            cruiser_dropdown.visibility = View.GONE
        } else {
            cruiser_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, cruiser_dropdown)
        }
    }

    fun toggle_contents_destroyer(v: View) {
        if (destroyer_dropdown.isShown) {
            FX.slide_up(this, destroyer_dropdown)
            //TODO fix slide up
            destroyer_dropdown.visibility = View.GONE
        } else {
            destroyer_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, destroyer_dropdown)
        }
    }

    fun toggle_contents_dreadnought(v: View) {
        if (dreadnought_dropdown.isShown) {
            FX.slide_up(this, dreadnought_dropdown)
            //TODO fix slide up
            dreadnought_dropdown.visibility = View.GONE
        } else {
            dreadnought_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, dreadnought_dropdown)
        }
    }

    fun toggle_contents_fighter(v: View) {
        if (fighter_dropdown.isShown) {
            FX.slide_up(this, fighter_dropdown)
            //TODO fix slide up
            fighter_dropdown.visibility = View.GONE
        } else {
            fighter_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, fighter_dropdown)
        }
    }

    fun toggle_contents_infantry(v: View) {
        if (infantry_dropdown.isShown) {
            FX.slide_up(this, infantry_dropdown)
            //TODO fix slide up
            infantry_dropdown.visibility = View.GONE
        } else {
            infantry_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, infantry_dropdown)
        }
    }

    fun toggle_contents_pds(v: View) {
        if (pds_dropdown.isShown) {
            FX.slide_up(this, pds_dropdown)
            //TODO fix slide up
            pds_dropdown.visibility = View.GONE
        } else {
            pds_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, pds_dropdown)
        }
    }

    fun toggle_contents_warsun(v: View) {
        if (warsun_dropdown.isShown) {
            FX.slide_up(this, warsun_dropdown)
            //TODO fix slide up
            warsun_dropdown.visibility = View.GONE
        } else {
            warsun_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, warsun_dropdown)
        }
    }
}

