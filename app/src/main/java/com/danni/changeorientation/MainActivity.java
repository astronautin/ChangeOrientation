package com.danni.changeorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button_landscape = (ImageButton)findViewById(R.id.id_toLandscape);
        button_landscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });

        ImageButton button_landscapeReverse = (ImageButton)findViewById(R.id.id_toLandscapeReverse);
        button_landscapeReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
            }
        });


        ImageButton button_portrait = (ImageButton)findViewById(R.id.id_toPortrait);
        button_portrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        });

        ImageButton button_portraitReverse = (ImageButton)findViewById(R.id.id_toPortraitReverse);
        button_portraitReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);
            }
        });


//        ImageButton button_toPortrait = (ImageButton)findViewById(R.id.id_toPortrait);
//        button_toPortrait.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int orientation = getResources().getConfiguration().orientation;
//                if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
//                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//                } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
//                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
//                }
//            }
//        });



    }
}