package com.example.twilightimperiumiv.CustomRace.CustomRaceModules;

public class FactionAbility {
    private String abilityName;
    private String abilityDescription;

    public FactionAbility(String abilityName, String abilityDescription) {
        this.abilityName = abilityName;
        this.abilityDescription = abilityDescription;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }

    public String getAbilityDescription() {
        return abilityDescription;
    }

    public void setAbilityDescription(String abilityDescription) {
        this.abilityDescription = abilityDescription;
    }
}
