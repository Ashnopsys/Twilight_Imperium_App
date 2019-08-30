package com.example.twilightimperiumiv.CustomRace;

public class Flagship {

    private String flagshipName;
    private String flagshipAbility;
    private int flagshipCost;
    private int flagshipCombat;
    private int flagshipCapacity;
    private int flagshipMove;

    public Flagship(String flagshipName, String flagshipAbility, int flagshipCost, int flagshipCombat, int flagshipCapacity, int flagshipMove) {
        this.flagshipName = flagshipName;
        this.flagshipAbility = flagshipAbility;
        this.flagshipCost = flagshipCost;
        this.flagshipCombat = flagshipCombat;
        this.flagshipCapacity = flagshipCapacity;
        this.flagshipMove = flagshipMove;
    }

    public Flagship(String flagshipName) {
        this.flagshipName = flagshipName;
    }


}
