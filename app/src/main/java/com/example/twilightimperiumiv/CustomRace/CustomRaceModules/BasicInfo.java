package com.example.twilightimperiumiv.CustomRace.CustomRaceModules;

public class BasicInfo {

    String name;
    String planetName;
    int planetResources;
    int planetInfluence;
    String lore;

    public BasicInfo(String name, String planetName, String planetResources, String planetInfluence, String lore) {
        this.name = name;
        this.planetName = planetName;
        this.planetResources = Integer.parseInt(planetResources);
        this.planetInfluence = Integer.parseInt(planetInfluence);
        this.lore = lore;
    }

    public BasicInfo() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetResources() {
        return planetResources;
    }

    public void setPlanetResources(int planetResources) {
        this.planetResources = planetResources;
    }

    public int getPlanetInfluence() {
        return planetInfluence;
    }

    public void setPlanetInfluence(int planetInfluence) {
        this.planetInfluence = planetInfluence;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
}
