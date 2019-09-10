package com.example.twilightimperiumiv.CustomRace.CustomRaceModules;

import com.example.twilightimperiumiv.CustomRace.Ships.Ship;

import java.util.ArrayList;

public class ShipSheet {



    public boolean hasAllShipTypes(ArrayList<Ship> shipList) {
        if (shipList.size() == 8) {
            return true;
        } else {
            return false;
        }
    }
}
