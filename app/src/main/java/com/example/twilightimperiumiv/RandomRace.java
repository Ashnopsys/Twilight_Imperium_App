package com.example.twilightimperiumiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class RandomRace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_race);

        TextView name = (TextView)findViewById(R.id.raceName);
        TextView diceRoll = (TextView)findViewById(R.id.d10);

        Intent secondIntent = getIntent();
        Race message = (Race)secondIntent.getSerializableExtra("RACE");

        ImageView image = (ImageView) findViewById(R.id.raceImage);
        image.setImageResource(getResources().getIdentifier(message.getImageName(), "drawable",
                this.getPackageName()));

        name.setText(message.getName());
        diceRoll.setText(diceRoll());
    }
    public class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Button button = (Button) v;
            Intent intent = new Intent(v.getContext(), RandomRace.class);
            startActivity(intent);
        }
    }
    public String diceRoll(){
        Random rand = new Random();
        Integer number = rand.nextInt(10);
        return number.toString();
    }


}
