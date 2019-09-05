package com.example.twilightimperiumiv;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.NavigationView;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RaceInfo extends AppCompatActivity {

 //   private TextView textView;
    private StringBuilder text = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_info);
        BufferedReader reader = null;


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Intent raceIntent = getIntent();

        //Can now compare message to the RaceList and find Race that way.
        String message = (String) raceIntent.getSerializableExtra("RACE_LORE");
        toolbar.setTitle(message);
        setSupportActionBar(toolbar);
        System.out.println("HERE: " + message);

        Race SELECTED_RACE = findRaceInList(message);
        String SELECT_RACE_FILENAME = SELECTED_RACE.getLoreFileName() + ".txt";


        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(SELECT_RACE_FILENAME)));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                text.append(mLine);
                text.append('\n');
            }
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
//            ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
//            View headerView = scrollView.getRootView();
            TextView output = (TextView) findViewById(R.id.textView4);

            output.setText((CharSequence) text);
        }
    }





    public Race findRaceInList(String raceName) {
        RaceList racelist = new RaceList();
        for(int i = 0; i < racelist.getRaceList().size(); i++) {
            System.out.println(racelist.getRaceList().get(i).getName());
            if (raceName.equalsIgnoreCase(racelist.getRaceList().get(i).getName())){
                return racelist.getRaceList().get(i);
            }
            else {
                System.out.println("Couldn't find race! Trying again!");
             //   findRaceInList(raceName);
            }
        }
        return null;
    }

    public String loreText(){
        return "";
    }
}
