package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<LibraryItem> library = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println(" Welcome to the Library Manager!");
        System.out.println("---------------------------------");

        mainMenu();
    }

    public static void mainMenu() {
        while(true) {
            System.out.println("1. List all items");
            System.out.println("2. Add new book");
            System.out.println("3. Add new album");
            System.out.println("4. Add new movie");
            System.out.println("5. Read books");
            System.out.println("6. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                listAllItems();
            } else if (choice.equals("2")) {
                addNewBook();
            } else if (choice.equals("3")) {
                addNewAlbum();
            } else if (choice.equals("4")) {
                addNewMovie();
            } else if (choice.equals("5")) {
                readBooks();
            } else if (choice.equals("6")) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void listAllItems() {
        for (LibraryItem item : library) {
            System.out.println(item);
        }
    }

    public static void addNewBook() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter page count:");
        int pageCount = Integer.parseInt(scanner.nextLine());

        library.add(new Book(title, author, year, pageCount));
    }

    public static void addNewAlbum() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter track count:");
        int trackCount = Integer.parseInt(scanner.nextLine());

        library.add(new Album(title, author, year, trackCount));
    }

    public static void addNewMovie() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();

        System.out.println("Enter year:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter duration in minutes: ");
        int durationInMinutes = Integer.parseInt(scanner.nextLine());

        library.add(new Movie(title, author, year, durationInMinutes));
    }

    public static void readBooks() {
        for (LibraryItem item : library) {
            if (item instanceof Book) {
                ((Book) item).readBook();
            }
        }
    }
}