package com.example.twilightimperiumiv.CustomRace.Ships;

public class Ship {

    private String name;
    private String ability;
    private int cost;
    private int combat;
    private int capacity;
    private int move;

    public Ship() {

    }

    public Ship(String name, String ability, int cost, int combat, int capacity, int move) {
        this.name = name;
        this.ability = ability;
        this.cost = cost;
        this.combat = combat;
        this.capacity = capacity;
        this.move = move;
    }

    public String getName() {
        return name;
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
}
