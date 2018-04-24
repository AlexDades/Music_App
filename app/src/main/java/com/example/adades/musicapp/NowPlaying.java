package com.example.adades.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by adades on 17/04/2018.
 */

public class NowPlaying extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Intent intent  = getIntent();
        Song exampleSong = intent.getParcelableExtra("song name");
        String songName = exampleSong.getSongName();
        String artist = exampleSong.getArtist();


        TextView songNameTextView = findViewById(R.id.song_name);
        songNameTextView.setText(songName);

        TextView artistTextView = findViewById(R.id.artist);
        artistTextView.setText(artist);

        ImageView previousSong = findViewById(R.id.previous);
        ImageView play = findViewById(R.id.play);
        ImageView pause = findViewById(R.id.pause);
        ImageView next = findViewById(R.id.next);


    }


}