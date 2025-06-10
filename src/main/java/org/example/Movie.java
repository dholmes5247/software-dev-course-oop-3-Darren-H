package org.example;

public class Movie extends LibraryItem {
    protected int durationInMinutes;

    // constructor
    public Movie(String title, String author, int year, int durationInMinutes) {
        //Call the parent
        super(title, year, author);
        //Set this class
        this.durationInMinutes = durationInMinutes;
    }
    //Getters and Setters

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
    }

}
