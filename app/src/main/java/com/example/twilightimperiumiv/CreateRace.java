package com.example.twilightimperiumiv;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.twilightimperiumiv.CustomRace.CustomRace;
import com.google.gson.Gson;

import java.util.ArrayList;

public class CreateRace extends AppCompatActivity {
    ArrayList<String> racesNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_race);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View factionAbilitiesButton = findViewById(R.id.floatingFactionAbilitiesButton);


        factionAbilitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText abilityName = new EditText(view.getContext());
                abilityName.setText("Enter Ability Name");
                abilityName.setTextSize(13);

                EditText abilityDescription = new EditText(view.getContext());
                abilityDescription.setText("Enter a Description for the ability");
                abilityDescription.setTextSize(10);
                abilityDescription.setBackgroundResource(android.R.color.transparent);

                LinearLayout abilitiesSV = findViewById(R.id.abilitiesLayout);
                abilitiesSV.addView(abilityName);
                abilitiesSV.addView(abilityDescription);
            }
        });
        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            /*TODO:
             *want to save both the Race into an array and also save the racename
             * the Race needs to be reloadable while the racename needs to be displayed in the
             * RecyclerView*/
            @Override
            public void onClick(View view) {

                racesNames = RaceList.getFromPrefs(CreateRace.this);
                TextView raceNameTV = findViewById(R.id.raceName);
                String raceName = raceNameTV.toString();

                CustomRace newRace = new CustomRace(raceName);
                racesNames.add(raceName);
                Gson gson = new Gson();
                String racesHistoryListToString = gson.toJson(racesNames);

                SharedPreferences prefs = getSharedPreferences("prefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("history", racesHistoryListToString);
                editor.apply();

            }
        });


    }

    public void makeNewFactionAbility() {


    }

}
