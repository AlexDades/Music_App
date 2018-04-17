package com.example.adades.musicapp;

/**
 * Created by adades on 17/04/2018.
 */

public class Song {

    /**Default values of class attributes
     * values are private so that they cannot be modified by user**/
    private String sSongName, sArtist;
    private int sPlayButton;

    /**Class constructor**/
    public Song(String songName, String artist, int playButton){
        this.sSongName = songName;
        this.sArtist = artist;
        this.sPlayButton = playButton;
    }

    /**Getter for the song name**/
    public String getSongNAme(){
        return sSongName;
    }

    /**Getter for the artist*/
    public String getArtist(){
        return sArtist;
    }

    /**Getter for the play button*/
    public int getPlayButton(){
        return sPlayButton;
    }

}
