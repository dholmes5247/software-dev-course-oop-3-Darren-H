package org.example;

public class Book extends LibraryItem {
    protected int pageCount;

    // Constructor
    public Book(String title, int year, String author, int pageCount) {
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
        return "Book: " + title + "by: " + author + "(" + year + ")" + "-" + pageCount + "pages";

    }
    public void readBook() {
        System.out.println("REading " + title + "by " + author + "...");
        System.out.println("DONE!");
    }

}
