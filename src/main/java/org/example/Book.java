package org.example;

public class Book extends LibraryItem {
    protected int pageCount;

    // Constructor
    public Book(String title, String author, int year, int pageCount) {
        // call the parent
        super(title, year, author);
        // set this class
        this.pageCount = pageCount;
    }
    // getters and setters

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }


    public void readBook() {
        System.out.println("Reading " + title + "by " + author + "...");
        System.out.println("DONE!");
    }

}
