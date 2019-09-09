package com.example.twilightimperiumiv.CustomRace.Ships;

import java.util.ArrayList;

public class Ship {

    private ShipType shipType;
    private String ability;
    private int cost;
    private int combat;
    private int capacity;
    private int move;
    private boolean isUpgradable = false;
    private boolean isCustomShip = false;

    public Ship(ShipType shipType, boolean isCustomShip, ArrayList<Ship> customShips) {
        this.shipType = shipType;
        this.isCustomShip = isCustomShip;
        if(this.isCustomShip) {
            //Require some sort of input to make custom stats
            //set stats to 0 and can add this to a list to track custom ships.
            setStats(0, 0, 0, 0);
            customShips.add(this);

        } else {
            switch(shipType) {
                case DESTROYER:
                    setStats(1, 9, 0, 2);
                    break;
                case CRUISER:
                    setStats(2, 7, 0, 2);
                    break;
                case CARRIER:
                    setStats(3, 9, 4, 1);
                    break;
                case DREADNOUGHT:
                    setStats(4, 5, 1, 1);
                    break;
                case WARSUN:
                    setStats(0, 0, 0, 0);
                    break;
                case FIGHTER:
                    setStats(1, 9, 0, 0);
                    break;
                case INFANTRY:
                    setStats(1, 8, 0, 0);
                    break;
                case FLAGSHIP:
                    setStats(0, 0, 0, 0);
                    break;
            }

        }

    }

    public void setStats(int cost, int combat, int capacity, int move) {
        this.cost = cost;
        this.combat = combat;
        this.capacity = capacity;
        this.move = move;
    }

    public Boolean compareShipTypeToString(String shipString, ShipType shipEnum) {
        if (shipString.equalsIgnoreCase("destroyer") && shipEnum.equals(ShipType.DESTROYER)) {
            return true;
        }
        return false;
        //TODO Test this method with live app
        //TODO Finish implementing this method if it is successful
    }

    public Ship(ShipType shipType, String ability, int cost, int combat, int capacity, int move) {
        this.shipType = shipType;
        this.ability = ability;
        this.cost = cost;
        this.combat = combat;
        this.capacity = capacity;
        this.move = move;
    }

    public void setUpgradable(boolean upgradable) {
        this.isUpgradable = upgradable;
    }

    public ShipType getShipType() {
        return shipType;
    }
    public String getShipTypeAsString() {
        return shipType.toString();
    }

    public String getAbility() {
        return ability;
    }

    public int getCost() {
        return cost;
    }

    public int getCombat() {
        return combat;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMove() {
        return move;
    }

    public void setName(ShipType shipType) {
        this.shipType = shipType;
    }

    public boolean isUpgradable() {
        return isUpgradable;
    }

    public boolean isCustomShip() {
        return isCustomShip;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCombat(int combat) {
        this.combat = combat;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public void setCustomShip(boolean customShip) {
        isCustomShip = customShip;
    }
}

