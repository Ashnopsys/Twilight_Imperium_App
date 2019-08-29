package com.example.twilightimperiumiv;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MyClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        Intent intent = new Intent(v.getContext(), RandomRace.class);
    }
}
