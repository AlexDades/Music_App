package com.example.adades.musicapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Word adapter of Song type objects
 */

public class SongAdapter extends ArrayAdapter<Song> {
    public int mColorResource;

    public SongAdapter (Context context, ArrayList<Song> songs, int colorResource){
        super(context, 0, songs);
        mColorResource=colorResource;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        /**First we check if the view is being reused**/
        View mainActivityView = convertView;
        if(mainActivityView == null){
            mainActivityView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }

        /**Variable stores the song at the given position**/
        Song currentSong = getItem(position);

        /**Place the song name in the corresponding TextView**/
        TextView songName = mainActivityView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        /**Place the artist in the corresponding TextView**/
        TextView artist = mainActivityView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        /**Place the play button in the corresponding ImageView**/
        ImageView playButton = mainActivityView.findViewById(R.id.play);
        playButton.setImageResource(currentSong.getPlayButton());

/*
        */
/**Setting the color for each song item**//*

        View itemColor = mainActivityView.findViewById(R.id.song_list);
        int color = ContextCompat.getColor(getContext(),mColorResource);
        itemColor.setBackgroundColor(color);
*/

        /**Return the entire list item**/
        return mainActivityView;
    }
}
