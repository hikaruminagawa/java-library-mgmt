package library;

import java.util.Scanner; // Add import statement for Scanner class
import java.util.Arrays; // Add import statement for Arrays class

public class Library {
    public static void main(String[] args) {
        // Initialize lists of Titles, Authors, and Quanitities
        String[] titles = {
            "Anna Karenina",
            "To Kill a Mockingbird",
            "Ulysses",
            "One Hundred Years of Solitude",
            "The Great Gatsby"
        };
        
        String[] authors = {
            "Leo Tolstoy",
            "Harper Lee",
            "James Joyce",
            "Gabriel Garcia Marquez",
            "F. Scott Fitzgerald"
        };

        int[] quantities = {10, 5, 15, 7, 3};

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an action (1:Add, 2:Borrow, 3:return, 4:Exit)
        System.out.println("Enter an action (1:Add, 2:Borrow, 3:Return, 4:Exit): ");
        int action = scanner.nextInt();

        // Consume newline left-over
        scanner.nextLine();

        // Declare variables to store the title, author, and quantity of the book
        String title = "";
        String author = "";
        int quantity = 0;
        boolean bookExists = false;

        // Create a switch statement to handle the user's action
        switch (action) {
            case 1:
                // Prompt the user to enter the title of the book
                System.out.println("Enter the title of the book: ");
                title = scanner.nextLine();

                // Prompt the user to enter the author of the book
                System.out.println("Enter the author of the book: ");
                author = scanner.nextLine();

                System.out.println("Enter the quantity of the book: ");
                quantity = scanner.nextInt();
                
                // If the book already exists in the library, update the quantity
                for (int i = 0; i < titles.length; i++) {
                    if (titles[i].equals(title) && authors[i].equals(author)) {
                        quantities[i] += quantity;
                        System.out.println("Book updated successfully.");
                        bookExists = true;
                        break;
                    }
                }
                // If the book does not exist in the library, add the book
                if (!bookExists) {
                    titles = Arrays.copyOf(titles, titles.length + 1);
                    authors = Arrays.copyOf(authors, authors.length + 1);
                    quantities = Arrays.copyOf(quantities, quantities.length + 1);
                    titles[titles.length - 1] = title;
                    authors[authors.length - 1] = author;
                    quantities[quantities.length - 1] = quantity;
                    System.out.println("Book added successfully.");
                }
                break;         

            case 2:
                // Prompt the user to enter the title of the book
                System.out.println("Enter the title of the book: ");
                title = scanner.nextLine();

                // Prompt the user to enter the author of the book
                System.out.println("Enter the author of the book: ");
                author = scanner.nextLine();

                // If the book exists in the library, borrow the book
                for (int i = 0; i < titles.length; i++) {
                    if (titles[i].equals(title) && authors[i].equals(author)) {
                        // Set the bookExists flag to true
                        bookExists = true;
                        // Prompt the user to enter the quantity to borrow
                        System.out.println("Enter the quantity to borrow: ");
                        quantity = scanner.nextInt();
                        // If the quantity is available
                        if (quantities[i] >= quantity) {
                            quantities[i] -= quantity;
                            System.out.println("Book borrowed successfully.");
                            break;
                        } else {
                            // If the quantity is not available
                            System.out.println("Book not available. You can borrow up to " + quantities[i] + " books.");
                            break;
                        }
                    }
                }
                // If the book does not exist in the library
                if (!bookExists) {
                    // If the book does not exist in the library
                        System.out.println("Book not found.");
                        break;
                    } 
                break;

            case 3:
                // Prompt the user to enter the title of the book
                System.out.println("Enter the title of the book: ");
                title = scanner.nextLine();

                // Prompt the user to enter the author of the book
                System.out.println("Enter the author of the book: ");
                author = scanner.nextLine();

                // If the book exists in the library, return the book
                for (int i = 0; i < titles.length; i++) {
                    if (titles[i].equals(title) && authors[i].equals(author)) {
                        // Set the bookExists flag to true
                        bookExists = true;
                        // Prompt the user to enter the quantity to return
                        System.out.println("Enter the quantity to return: ");
                        quantity = scanner.nextInt();
                        // Return the book
                        quantities[i]++;
                        System.out.println("Book returned successfully.");
                        break;
                    }
                }
                // If the book does not exist in the library
                if (!bookExists) {
                    // If the book does not exist in the library
                        System.out.println("Book not found.");
                        break;
                    }
                break;

            case 4:
                // Exit the program
                System.out.println("Exiting the program...");
                break;

            default:
                // If the user enters an invalid action
                System.out.println("Invalid action. Please enter a valid number (ex: 1, 2, 3, 4).");
                break;
        } 
    }
}
