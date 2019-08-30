package com.example.twilightimperiumiv.CustomRace;

import com.example.twilightimperiumiv.Race;

import java.util.ArrayList;

public class CustomRace extends Race {

    String name;
    ArrayList<String> factionAbilities = new ArrayList<>();
    ArrayList<String> startingTech = new ArrayList<>();
    StringBuilder lore = new StringBuilder();

    Flagship flagship;

    private boolean customDreadnought = false;
    private boolean customWarsun = false;
    private boolean customCruiser = false;
    private boolean customDestroyer = false;
    private boolean customPDS = false;
    private boolean customCarrier = false;
    private boolean customFighter = false;
    private boolean customInfantry = false;
    private boolean customSpaceDock = false;

    public CustomRace (String name){this.name = name;}

    public class FactionAbility{
        String factionAbilityName;
        String factionAbilityDescription;
        public FactionAbility(String name, String description){
            this.factionAbilityName = name;
            this.factionAbilityDescription = description;
        }

    }


}
