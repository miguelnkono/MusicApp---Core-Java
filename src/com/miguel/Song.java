package com.miguel;

public class Song {
    private String title;        /// title of the song
    private double duration;    /// duration of the song

    /// parameter constructor
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    /// default constructor
    public Song() {}

    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
