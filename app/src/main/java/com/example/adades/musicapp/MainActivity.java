package com.example.adades.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Creating the ArrayList and declaring the songs**/
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));

        /**Creates the adapter containing the songs listed above**/
        SongAdapter adapter = new SongAdapter(this, songs);

        /**Create a ListeView item that store the adapter and displays the songs in a list**/
        final ListView listView = (ListView) findViewById(R.id.song_list);

        /**Set the adapter on the ListView**/
        listView.setAdapter(adapter);

        /**Creating an intent to open Now playing and passing the song through that intent**/
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int position, long id) {
                Intent play = new Intent(MainActivity.this, NowPlaying.class);
                String songName = listView.get(position).getSongName;
                startActivity(play);
            }
        });


    }

}
