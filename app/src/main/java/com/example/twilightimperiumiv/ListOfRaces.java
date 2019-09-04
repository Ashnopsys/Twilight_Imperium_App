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

        /*make a linear layout to add all of our buttons to*/
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

   }


}
