package com.example.raisul.customlist;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
public class Jessore_Detail extends AppCompatActivity {
    ImageView image;
    TextView textV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jessore__detail);

        image = (ImageView) findViewById(R.id.imageView);
        textV = (TextView) findViewById(R.id.text);
        Intent i = getIntent();
        int value = i.getIntExtra("index", 0);
        if (value == 0) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.sadar);
        }
        if (value == 1) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.sadar);
        }
        if (value == 2) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 3) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 4) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 5) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 6) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 7) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 8) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }
        if (value == 9) {
            image.setImageResource(R.drawable.loc);
            textV.setText(R.string.monirampur);
        }


    }


}

