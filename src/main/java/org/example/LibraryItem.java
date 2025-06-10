package org.example;

public class LibraryItem {
    protected String title;
    protected int year;
    protected String author;

    //Constructor
    public LibraryItem(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

//    toString method
    @Override
    public String toString() {
        return "Item: " + title + "by" + author + "(" + year + ")";
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }


}
