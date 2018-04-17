package com.example.adades.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by adades on 17/04/2018.
 */

public class SongList extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /**Creating the ArrayList and declaring the songs**/
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));
        songs.add(new Song("Johny I hardly new ya", "Dropkick Murphys", R.drawable.play));

        /**Creates the adapter containing the songs listed above**/
        SongAdapter adapter = new SongAdapter(this, songs);

        /**Create a ListeView item that store the adapter and displays the songs in a list**/
        ListView listView = (ListView) findViewById(R.id.song_list);

        /**Set the adapter on the ListView**/
        listView.setAdapter(adapter);
    }
}
