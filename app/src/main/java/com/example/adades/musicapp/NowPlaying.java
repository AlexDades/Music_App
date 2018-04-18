package com.example.adades.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by adades on 17/04/2018.
 */

public class NowPlaying extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        ImageView previousSong = findViewById(R.id.previous);
        ImageView play = findViewById(R.id.play);
        ImageView pause = findViewById(R.id.pause);
        ImageView next = findViewById(R.id.next);

        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}