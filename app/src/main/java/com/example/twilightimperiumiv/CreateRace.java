package com.example.twilightimperiumiv;

import android.content.Intent;
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

import com.google.gson.Gson;

public class CreateRace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_race);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View factionAbilitiesButton= findViewById(R.id.floatingFactionAbilitiesButton);
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

        Gson gson = new Gson();
        String customRaceToString; //need to add sharedprefs before this
        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    public void makeNewFactionAbility(){



    }

}
