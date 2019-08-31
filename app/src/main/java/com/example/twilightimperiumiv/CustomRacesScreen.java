package com.example.twilightimperiumiv;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.twilightimperiumiv.CustomRace.CustomRace;

import java.util.ArrayList;

public class CustomRacesScreen extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter rAdapt;
    //need to get serialized version of list and create list here to put in
    ArrayList<CustomRace> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_races_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(this, items));

        ArrayList<CustomRace> races = RaceList.getFromPrefs(this);
        if(races.size() <= 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < races.size(); i++) {
                rAdapt.addItem(races.get(i));
                System.out.print(races.size());
            }
        }

    }

}
