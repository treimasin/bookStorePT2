package book;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    // Add a book to the store
    // List all the books
    // View a single book
    // Remove a book
    // Find the most expensive book in the store

    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addBook() {
        System.out.println("Adding a book to the store");

        System.out.println("Please enter the book title");
        String title = scanner.nextLine();

        System.out.println("Please enter the price of book: ");
        float price = intScanner.nextFloat();

        System.out.println("Please enter the year of release: ");
        int yearOfRelease = intScanner.nextInt();

        System.out.println("Please enter the ISBN: ");
        int ISBN = intScanner.nextInt();

        Book book = new Book(title, price, yearOfRelease, ISBN);

        // ArrayList.add(item): Method for adding an item to the arrayList.
        books.add(book);

        System.out.println(book.title + "added successfully!");
    }

    public void listBooks() {
        System.out.println("Listing all the books in the store \n" );

        for (Book book: books) {
            System.out.println("Title: " + book.title + ", price: €" + book.price);
        }
    }

    public void findBook() {
        System.out.println("Please enter the ISBN of the book to find: ");

        int ISBN = intScanner.nextInt();

        for (Book book: books) {
            if (book.ISBN == ISBN) {
                System.out.println("Title: " + book.title + ", price" + book.price);
            } return;

        }
        System.out.println("Book not found!");
    }

    public void removeBook() {
        System.out.println("Please enter the ISBN of the book to remove: ");

        int ISBN = intScanner.nextInt();

        for (Book book: books) {
            if (book.ISBN == ISBN) {

                int index = books.indexOf(book);
                books.remove(index);

                System.out.println("Books removed successfully!");

            }
        }

    }

    public void viewMostExpensiveBook() {
        Book mostExpensive = books.get(0);

        for (int i = 1; i < books.size(); i++) {
            Book currentBook = books.get(i);
            if (currentBook.price > mostExpensive.price) {
                mostExpensive = currentBook;
            }
        }

        System.out.println("The most expensive book is " + mostExpensive.title + ", price: " + mostExpensive.price);
    }

}
