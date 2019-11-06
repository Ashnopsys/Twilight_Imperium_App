package com.example.twilightimperiumiv.CustomRace

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import com.example.twilightimperiumiv.CustomRace.Ships.Ship
import com.example.twilightimperiumiv.CustomRace.Ships.ShipType
import kotlinx.android.synthetic.main.fragment_three.*
import com.example.twilightimperiumiv.Fragments.FX
import kotlinx.android.synthetic.main.create_destroyer.view.*


class EnterShips  : AppCompatActivity() {
    lateinit var carrier_dropdown : View
    lateinit var cruiser_dropdown : View
    lateinit var destroyer_dropdown : View
    lateinit var dreadnought_dropdown : View
    lateinit var fighter_dropdown : View
    lateinit var infantry_dropdown : View
    lateinit var pds_dropdown : View
    lateinit var warsun_dropdown : View

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(com.example.twilightimperiumiv.R.layout.fragment_three)
    val customRace = CustomRace()

    val inflater: LayoutInflater = LayoutInflater.from(applicationContext)
    carrier_dropdown = inflater.inflate(com.example.twilightimperiumiv.R.layout.create_carrier, carrier_layout, false)
    carrier_layout.addView(carrier_dropdown)

    cruiser_dropdown = inflater.inflate(com.example.twilightimperiumiv.R.layout.create_cruiser, cruiser_layout, false)
    cruiser_layout.addView(cruiser_dropdown)
    destroyer_dropdown = inflater.inflate(com.example.twilightimperiumiv.R.layout.create_cruiser, destroyer_layout, false)
            destroyer_layout.addView(destroyer_dropdown)
    val ship_views = arrayOf(carrier_dropdown, cruiser_dropdown)

//            , destroyer_dropdown, dreadnought_dropdown,
//                infantry_dropdown, pds_dropdown, warsun_dropdown)


        makeAllViewsGone(ship_views)

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

    fun toggle_contents_cruiser(v : View) {
        if (cruiser_dropdown.isShown) {
            FX.slide_up(this, cruiser_dropdown)
            //TODO fix slide up
            cruiser_dropdown.visibility = View.GONE
        } else {
            cruiser_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, cruiser_dropdown)
        }
    }
    fun toggle_contents_destroyer(v : View) {
        if (destroyer_dropdown.isShown) {
            FX.slide_up(this, destroyer_dropdown)
            //TODO fix slide up
            destroyer_dropdown.visibility = View.GONE
        } else {
            destroyer_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, destroyer_dropdown)
        }
    }

    fun toggle_contents_dreadnought(v : View) {
        if (dreadnought_dropdown.isShown) {
            FX.slide_up(this, dreadnought_dropdown)
            //TODO fix slide up
            dreadnought_dropdown.visibility = View.GONE
        } else {
            dreadnought_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, dreadnought_dropdown)
        }
    }
    fun toggle_contents_fighter(v : View) {
        if (fighter_dropdown.isShown) {
            FX.slide_up(this, fighter_dropdown)
            //TODO fix slide up
            fighter_dropdown.visibility = View.GONE
        } else {
            fighter_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, fighter_dropdown)
        }
    }
    fun toggle_contents_infantry(v : View) {
        if (infantry_dropdown.isShown) {
            FX.slide_up(this, infantry_dropdown)
            //TODO fix slide up
            infantry_dropdown.visibility = View.GONE
        } else {
            infantry_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, infantry_dropdown)
        }
    }
    fun toggle_contents_pds(v : View) {
        if (pds_dropdown.isShown) {
            FX.slide_up(this, pds_dropdown)
            //TODO fix slide up
            pds_dropdown.visibility = View.GONE
        } else {
            pds_dropdown.visibility = View.VISIBLE
            FX.slide_down(this, pds_dropdown)
        }
    }
    fun toggle_contents_warsun(v : View) {
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

