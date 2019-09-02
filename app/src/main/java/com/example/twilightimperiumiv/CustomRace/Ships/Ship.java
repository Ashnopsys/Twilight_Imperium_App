package com.example.twilightimperiumiv.CustomRace.Ships;

enum ShipType {
    DESTROYER, CRUISER, CARRIER, DREADNOUGHT, WARSUN, FIGHTER, INFANTRY, FLAGSHIP //unsure about flagship being Enum
}

public class Ship {

    protected ShipType shipType;
    protected String ability;
    protected int cost;
    protected int combat;
    protected int capacity;
    protected int move;
    protected boolean isUpgradable = false;

    public Ship(ShipType shipType) {
        this.shipType = shipType;

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

    public void setStats(int cost, int combat, int capacity, int move) {
        this.cost = cost;
        this.combat = combat;
        this.capacity = capacity;
        this.move = move;
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


}

