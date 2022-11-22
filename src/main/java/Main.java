import book.Store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Build a bookstore application on the command line // DONE
        // The app should be able to perform certain tasks
        // Add a book
        // List all books
        // Remove a book
        // Find a book by its ISBN
        // Find the most expensive book

        System.out.println("Welcome to the bookstore!");
        Store storeBook = new Store();
        Scanner scanner = new Scanner(System.in);


        String input = "";


        do {
            System.out.println("""
                    
                    Please choose an activity below
                                        
                    1. Add a book
                    2. List all the books
                    3. Remove a book
                    4. Find a book by its ISBN
                    5. Find the most expensive book
                    """);

            input = scanner.nextLine();

            switch (input) {
                case "exit":
                    System.out.println("Exiting the program...");
                    break;
                case "1":
                    storeBook.addBook();
                    break;
                case "2":
                    storeBook.listBooks();
                    break;
                case "3":
                    storeBook.removeBook();
                    break;
                case "4":
                    storeBook.findBook();
                    break;
                case "5":
                    storeBook.viewMostExpensiveBook();
                    break;
                default:
                    System.out.println("Please select a valid input.");
                    break;

            }


        } while (!input.equals("exit"));


    }
}