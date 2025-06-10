package org.example;

public class Album extends LibraryItem {
    protected int trackCount;

    //Constructor
    public Album(String title, int year, String author, int trackCount) {
        // Call the parent constructor
    super(title, year, author);
    //Set this classes fields
        this.trackCount = trackCount;
    }

    // Getters and Setters
    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return "Album: " + title + " by " + author + "(" + year + ") - " + trackCount + "tracks";
    }

}
