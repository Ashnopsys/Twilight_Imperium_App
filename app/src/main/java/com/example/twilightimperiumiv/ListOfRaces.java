package com.example.twilightimperiumiv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ListOfRaces extends AppCompatActivity {
    int i;
    int currentRace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_races);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Lore of the Houses");
        setSupportActionBar(toolbar);
        final RaceList raceList = new RaceList();


        LinearLayout layout = (LinearLayout) findViewById(R.id.linearView);
        for (i = 0;i < raceList.getRaceList().size(); i++) // iterate over array of existing races
        {
            // Create the button
            Button button = new Button(this);
            button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            button.setText(raceList.getRaceList().get(i).getName());
            layout.addView(button); // add to layout
            currentRace = i;

            button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RaceInfo.class);
                Button button = (Button)view;

                intent.putExtra("RACE_LORE", button.getText());
                startActivity(intent);
            }
        });

        }

//        Do not enjoy this next code. Will be changing this when more research is done on creating
//        a dynamic  clicklistener.

//        int arborecID = R.id.arborec;
//        View v = findViewById(arborecID);
//        Button arborecRace = (Button) v;
//        arborecRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[2]);
//                startActivity(intent);
//            }
//        });

//        int hacanID = R.id.hacan;
//        View v_hacan = findViewById(hacanID);
//        Button hacanRace = (Button) v_hacan;
//        hacanRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[0]);
//                startActivity(intent);
//            }
//        });
//        int creussID = R.id.creuss;
//        View v_creuss = findViewById(creussID);
//        Button creussRace = (Button) v_creuss;
//        creussRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[1]);
//                startActivity(intent);
//            }
//        });
//        int muaatID = R.id. muaat;
//        View v_muaat = findViewById(muaatID);
//        Button muaatRace = (Button) v_muaat;
//        muaatRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[3]);
//                startActivity(intent);
//            }
//        });
//        int naaluID = R.id.naalu;
//        View v_naalu = findViewById(naaluID);
//        Button naaluRace = (Button) v_naalu;
//        naaluRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[4]);
//                startActivity(intent);
//            }
//        });
//        int jolnaar = R.id.jolnar;
//        View v_jolnaar = findViewById(jolnaar);
//        Button jolnaarRace = (Button) v_jolnaar;
//        jolnaarRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[5]);
//                startActivity(intent);
//            }
//        });
//        int yin = R.id.yin;
//        View v_yin = findViewById(yin);
//        Button yinRace = (Button) v_yin;
//        yinRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[6]);
//                startActivity(intent);
//            }
//        });
//        int letnev = R.id.letnev;
//        View v_letnev = findViewById(letnev);
//        Button letnevRace = (Button) v_letnev;
//        letnevRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[7]);
//                startActivity(intent);
//            }
//        });
//        int l1z1x = R.id.l1z1x;
//        View v_l1z1x = findViewById(l1z1x);
//        Button l1z1xRace = (Button) v_l1z1x;
//        l1z1xRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[8]);
//                startActivity(intent);
//            }
//        });
//        int nekro = R.id.nekro;
//        View v_nekro = findViewById(nekro);
//        Button nekroRace = (Button) v_nekro;
//        nekroRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[9]);
//                startActivity(intent);
//            }
//        });
//        int winnu = R.id.winnu;
//        View v_winnu = findViewById(winnu);
//        Button winnuRace = (Button) v_winnu;
//        winnuRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[10]);
//                startActivity(intent);
//            }
//        });
//        int yssaril = R.id.yssaril;
//        View v_yssaril = findViewById(yssaril);
//        Button yssarilRace = (Button) v_yssaril;
//        yssarilRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[11]);
//                startActivity(intent);
//            }
//        });
//        int saar = R.id.saar;
//        View v_saar = findViewById(saar);
//        Button saarRace = (Button) v_saar;
//        saarRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[12]);
//                startActivity(intent);
//            }
//        });
//        int sol = R.id.sol;
//        View v_sol = findViewById(sol);
//        Button solRace = (Button) v_sol;
//        solRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[13]);
//                startActivity(intent);
//            }
//        });
//        int mentak = R.id.mentak;
//        View v_mentak = findViewById(mentak);
//        Button mentakRace = (Button) v_mentak;
//        mentakRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[14]);
//                startActivity(intent);
//            }
//        });
//        int sardakk = R.id.sardakk;
//        View v_sardakk = findViewById(sardakk);
//        Button sardakkRace = (Button) v_sardakk;
//        sardakkRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[15]);
//                startActivity(intent);
//            }
//        });
//        int xxcha = R.id.xxcha;
//        View v_xxcha = findViewById(xxcha);
//        Button xxchaRace = (Button) v_xxcha;
//        xxchaRace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), RaceInfo.class);
//                intent.putExtra("RACE_LORE", raceList.getRaceList()[16]);
//                startActivity(intent);
//            }
//        });
//
   }


}
