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
    private FactionAbility factionAbility;
    private ShipSheet shipSheet;

    public CustomRace (String customRaceName) {
        this.customRaceName = customRaceName;
    }

    public CustomRace (BasicInfo basicInfo, FactionAbility factionAbility, ShipSheet shipSheet) {
        this.basicInfo = basicInfo;
        this.factionAbility = factionAbility;
        this.shipSheet = shipSheet;
    }

    @Override
    public String getName() {
        return customRaceName;
    }



}
