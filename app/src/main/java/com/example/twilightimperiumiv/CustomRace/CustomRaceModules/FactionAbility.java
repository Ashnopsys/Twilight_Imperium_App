package com.example.twilightimperiumiv.CustomRace.CustomRaceModules;

import android.view.View;

public class FactionAbility {
    private String abilityName;
    private String abilityDescription;
    private View view;

    public FactionAbility(String abilityName, String abilityDescription, View view) {
        this.abilityName = abilityName;
        this.abilityDescription = abilityDescription;
        this.view = view;
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
