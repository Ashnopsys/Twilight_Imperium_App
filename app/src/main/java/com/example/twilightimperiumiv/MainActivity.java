package com.example.twilightimperiumiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RaceList races = new RaceList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int buttonRandomID = R.id.randomRaceBut;
        View v = findViewById(buttonRandomID);
        Button randomRace = (Button) v;
        randomRace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click Random Race");
                Button button = (Button) view;
                Intent intent = new Intent(view.getContext(), RandomRace.class);
                intent.putExtra("RACE", getRandomRace());
                startActivity(intent);
            }
        });

        int buttonRaceLoreID = R.id.race_lore;
        View x = findViewById(buttonRaceLoreID);
        Button loreBut = (Button) x;
        loreBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click List");
                Button button = (Button) view;
                Intent intent = new Intent(view.getContext(), ListOfRaces.class);
                startActivity(intent);
            }
        });

//        int buttonMapID = R.id.randomRaceBut;
//        View w = findViewById(buttonMapID);
//        Button mapBut = (Button) w;
//        mapBut.setOnClickListener(new MyClickListener());


    }


    public Race getRandomRace(){
        Random rand = new Random();
        int number = rand.nextInt(races.getRaceList().size());
        return races.getRaceList().get(number);
    }



}
