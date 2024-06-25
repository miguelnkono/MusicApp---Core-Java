package com.miguel;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album(){}

    /// Check for an existing songs
    public Song findSong(String title) {
        for(Song checkSong : songs) {
            if(checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    /// Adding a song
    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            songs.add(new Song(title, duration));
            //System.out.println(title + " successfully added to the list.");
            return true;
        } else {
            //System.out.println("Song with name " + title + " already exist in the list.");
            return false;
        }
    }

    /// Add a song to the playlist with the index of the song.
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList) {
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()) {
            /// Adding the index of an element of the arrayList into a linked list
            PlayList.add(this.songs.get(index));
            return true;
        } else {
            //System.out.println("This album doesn't have song with track number " + trackNumber);
            return false;
        }
    }

    /// Add a song to the playlist with the title of the song.
    public boolean addToPlayList(String title, LinkedList<Song> PlayList) {
        for(Song checkSong : this.songs) {
            if(checkSong.getTitle().equals(title)) {
                PlayList.add(checkSong);
                return true;
            }
        }
        //System.out.println(title + " there is not such song on the album.");
        return false;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
