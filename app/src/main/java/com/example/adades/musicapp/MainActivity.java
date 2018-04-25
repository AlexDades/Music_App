package com.example.adades.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Creating the ArrayList and declaring the songs**/
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Johny I hardly knew ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Despacito", "Luis Fonsi & Daddy Yankee", R.drawable.play));
        songs.add(new Song("Shape of You", "Ed Sheeran", R.drawable.play));
        songs.add(new Song("Swish Swish", "Katy Perry ft. Nicki Minaj", R.drawable.play));
        songs.add(new Song("John Wayne", "Lady Gaga", R.drawable.play));
        songs.add(new Song("24K Magic", "Bruno Mars", R.drawable.play));
        songs.add(new Song("Naughty Girl", "Beyonce", R.drawable.play));
        songs.add(new Song("Side to Side", "Ariana Grande ft. Nicki Minaj", R.drawable.play));
        songs.add(new Song("Keep On Moving", "Michelle Delamor", R.drawable.play));
        songs.add(new Song("Nice For What", "Drake ", R.drawable.play));
        songs.add(new Song("God's Plan", "Drake ", R.drawable.play));
        songs.add(new Song("Shape of You", "Ed Sheeran", R.drawable.play));
        songs.add(new Song("Swish Swish", "Katy Perry ft. Nicki Minaj", R.drawable.play));
        songs.add(new Song("John Wayne", "Lady Gaga", R.drawable.play));
        songs.add(new Song("24K Magic", "Bruno Mars", R.drawable.play));
        songs.add(new Song("Naughty Girl", "Beyonce", R.drawable.play));
        songs.add(new Song("Side to Side", "Ariana Grande ft. Nicki Minaj", R.drawable.play));
        songs.add(new Song("Finesse", " Bruno Mars & Cardi B ", R.drawable.play));

        /**Creates the adapter containing the songs listed above**/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.song_background_color);

        /**Create a ListeView item that store the adapter and displays the songs in a list**/
        final ListView listView = (ListView) findViewById(R.id.song_list);

        /**Set the adapter on the ListView**/
        listView.setAdapter(adapter);

        /**Creating an intent to open Now playing and passing the song through that intent**/
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int position, long id) {
                Intent play = new Intent(MainActivity.this, NowPlaying.class);

                String songName = songs.get(position).getSongName();
                String artist = songs.get(position).getArtist();
                play.putParcelableArrayListExtra("song list", songs);
                play.putExtra("song name", songs.get(position).getSongName());
                play.putExtra("artist", songs.get(position).getArtist());
                play.putExtra("position", position);
                startActivity(play);
            }
        });



    }

}
