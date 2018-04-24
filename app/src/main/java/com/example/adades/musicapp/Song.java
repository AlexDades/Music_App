package com.example.adades.musicapp;

import android.os.Parcel;
import android.os.Parcelable;

import static java.lang.System.in;

/**
 * Created by adades on 17/04/2018.
 */

public class Song implements Parcelable {

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
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public Song createFromPArcel(Parcel in){
            return new Song(in);
        }

        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        public Song[] newArray(int size){
            return new Song[size];
        }
    };

    /**Getter for the song name**/
    public String getSongName(){
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

    public Song(Parcel in){
        this.sPlayButton = in.readInt();
        this.sSongName = in.readString();
        this.sArtist = in.readString();
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeInt(this.sPlayButton);
        dest.writeString(this.sSongName);
        dest.writeString(this.sArtist);
    }

}
