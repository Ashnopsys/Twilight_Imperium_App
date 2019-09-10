package com.example.twilightimperiumiv;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RaceList races = new RaceList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        final ImageView backgroundOne = (ImageView) findViewById(R.id.background_one);
        final ImageView backgroundTwo = (ImageView) findViewById(R.id.background_two);
        final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(10000L);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int avoidGreyBars = 30; //prevents grey bars between views and stuttering
                final float progress = (float) animation.getAnimatedValue();
                final float width = backgroundOne.getWidth() - avoidGreyBars;
                final float translationX = width * progress;
                backgroundOne.setTranslationX(translationX);
                backgroundTwo.setTranslationX(translationX - width);
            }
        });

        animator.start();


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

        View customRace = findViewById(R.id.custom_race_button);
        Button customRaceBut = (Button) customRace;
        customRaceBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click List");
                Intent intent = new Intent(view.getContext(), TabCreateRace.class);
                startActivity(intent);
            }
        });

        int customRacesScreen = R.id.customRacesScreenBut;
        View customRaces = findViewById(customRacesScreen);
        Button customRacesBut = (Button) customRaces;
        customRacesBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click List");
                Intent intent = new Intent(view.getContext(), CustomRacesScreen.class);
                startActivity(intent);
            }
        });

        int check = R.id.mapBut;
        View checkBacl = findViewById(check);
        Button checkBackBut = (Button) checkBacl;
        checkBackBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer width = backgroundOne.getWidth();
                Log.d("Check", width.toString());
            }
        });

    }


    public Race getRandomRace(){
        //method for the RandomRace Activity
        Random rand = new Random();
        int number = rand.nextInt(races.getRaceList().size());
        return races.getRaceList().get(number);
    }





}
