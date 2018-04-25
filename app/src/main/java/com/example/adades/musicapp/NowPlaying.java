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

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by adades on 17/04/2018.
 */

public class NowPlaying extends AppCompatActivity {
    int currentPosition;
    TextView songNameTextView;
    TextView artistTextView;
    ArrayList<Song> songs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        currentPosition = getIntent().getExtras().getInt("position");

        songs = getIntent().getParcelableArrayListExtra("song list");
        String songName = getIntent().getExtras().getString("song name");
        String artist = getIntent().getExtras().getString("artist");


        songNameTextView = findViewById(R.id.song_name);
        songNameTextView.setText(songName);

        artistTextView = findViewById(R.id.artist);
        artistTextView.setText(artist);

        ImageView previousSong = findViewById(R.id.previous);
        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentPosition == 0){
                    currentPosition = songs.size() - 1;
                    songNameTextView.setText(songs.get(currentPosition).getSongName());
                    artistTextView.setText(songs.get(currentPosition).getArtist());
                }
                else
                {   songNameTextView.setText(songs.get(currentPosition--).getSongName());
                    artistTextView.setText(songs.get(currentPosition--).getArtist());
                }
                    currentPosition--;
            }

        });

        ImageView nextSong = findViewById(R.id.next);
        nextSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentPosition == songs.size() - 1){
                    currentPosition = 0;
                    songNameTextView.setText(songs.get(currentPosition).getSongName());
                    artistTextView.setText(songs.get(currentPosition).getArtist());
                }
                else
                {   songNameTextView.setText(songs.get(currentPosition++).getSongName());
                    artistTextView.setText(songs.get(currentPosition++).getArtist());
                }
                currentPosition++;
            }

        });
    }
}




