package com.example.twilightimperiumiv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MapDraw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_draw);

        MyImageView imageView = (MyImageView)findViewById(R.id.map);
        Bitmap dbitmap = BitmapFactory.decodeResource(getResources(), R.drawable.map);
        Bitmap bitmap = dbitmap.copy(Bitmap.Config.ARGB_8888, true);
        imageView.setImageBitmap(bitmap);
        imageView.invalidate();

    }
}
