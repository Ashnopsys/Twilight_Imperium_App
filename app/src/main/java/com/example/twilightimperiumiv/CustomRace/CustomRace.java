package com.example.twilightimperiumiv.CustomRace;

import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.BasicInfo;
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.FactionAbility;
import com.example.twilightimperiumiv.CustomRace.CustomRaceModules.ShipSheet;
import com.example.twilightimperiumiv.CustomRace.Ships.Ship;
import com.example.twilightimperiumiv.Race;

import java.util.ArrayList;

public class CustomRace extends Race {

    private String customRaceName;
    private BasicInfo basicInfo;
    private ArrayList<FactionAbility> factionAbility;
    private ArrayList<Ship> shipSheet;

    public CustomRace (String customRaceName) {
        this.customRaceName = customRaceName;
    }

    public CustomRace() {}

    public CustomRace (BasicInfo basicInfo, ArrayList<FactionAbility> factionAbility, ArrayList<Ship> shipSheet) {
        this.basicInfo = basicInfo;
        this.factionAbility = factionAbility;
        this.shipSheet = shipSheet;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        this.customRaceName = basicInfo.getName();
    }

    public void setFactionAbility(ArrayList<FactionAbility> factionAbility) {
        this.factionAbility = factionAbility;
    }

    public void setShipSheet(ArrayList<Ship> shipSheet) {
        this.shipSheet = shipSheet;
    }

    @Override
    public String getName() {
        return customRaceName;
    }



}
