package com.example.twilightimperiumiv.CustomRace;

import com.example.twilightimperiumiv.CustomRace.Ships.Ship;
import com.example.twilightimperiumiv.Race;

import java.util.ArrayList;

public class CustomRace extends Race {

    private String customRaceName;
    private ArrayList<String> factionAbilities = new ArrayList<>();
    private ArrayList<String> startingTech = new ArrayList<>();
    private StringBuilder lore = new StringBuilder();

    private boolean customDreadnought = false;
    private boolean customWarsun = false;
    private boolean customCruiser = false;
    private boolean customDestroyer = false;
    private boolean customPDS = false;
    private boolean customCarrier = false;
    private boolean customFighter = false;
    private boolean customInfantry = false;
    private boolean customSpaceDock = false;

    public CustomRace (String customRaceName) {
        this.customRaceName = customRaceName;
    }

    @Override
    public String getName() {
        return customRaceName;
    }

    public class FactionAbility{
        //Use anonymous classes to make abilities
        String factionAbilityName;
        String factionAbilityDescription;
        public FactionAbility(String factionAbilityName, String description){
            this.factionAbilityName = factionAbilityName;
            this.factionAbilityDescription = description;
        }

    }

    public boolean hasOneTypeOfEachShip(ArrayList<Ship> shipList) {
        return false;
    }

    public boolean hasAllShipTypes(ArrayList<Ship> shipList) {
        if (shipList.size() == 8) {
            return true;
        } else {
            return false;
        }
    }


}
