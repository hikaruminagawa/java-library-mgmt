package library;

import java.util.Scanner;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        // Initialize lists of Titles, Authors, and Quanitities
        String[] titles = {
            "The Da Vinci Code",
            "The Alchemist",
            "The Godfather",
            "The Catcher in the Rye",
            "To Kill a Mockingbird"
            };
            
        String[] authors = {
            "Dan Brown",
            "Paulo Coelho",
            "Mario Puzo",
            "J.D. Salinger",
            "Harper Lee"
            };

        int[] quantities = {10, 5, 15, 7, 3};

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        
        // Prompt the user to enter an action (1:Add, 2:Borrow, 3:return, 4:Exit)
        System.out.println("Enter an action (1:Add, 2:Borrow, 3:Return, 4:Exit): ");
        int action = scanner.nextInt();

        // Consume newline left-over
        scanner.nextLine();

        String title = "";
        String author = "";
        int quantity = 0;
        
       

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
                boolean bookExists = false;
                    for (int i = 0; i < titles.length; i++) {
                        if (titles[i].equals(title) && authors[i].equals(author)) {
                            quantities[i] += quantity;
                            System.out.println("Book updated successfully.");
                            bookExists = true;
                            break;
                        }
                    }
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
                        // Prompt the user to enter the quantity to borrow
                        System.out.println("Enter the quantity to borrow: ");
                        quantity = scanner.nextInt();
                        // If the quantity is available
                        if (quantities[i] >= quantity) {
                            quantities[i] -= quantity;
                            System.out.println("Book borrowed successfully.");
                            break;
                        } else {
                            System.out.println("Book not available. You can borrow " + quantities[i] + " books.");
                            break;
                        }
                    } else {
                        // If the book does not exist in the library
                        System.out.println("Book not found.");
                        break;
                    }
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
                        // Prompt the user to enter the quantity to borrow
                        System.out.println("Enter the quantity to borrow: ");
                        quantity = scanner.nextInt();
                        // Return the book
                        quantities[i]++;
                        System.out.println("Book returned successfully.");
                        break;
                    } else {
                        // If the book does not exist in the library
                        System.out.println("Book not found.");
                        break;
                    }
                }
                break;

            case 4:
                // Exit the program
                System.out.println("Exiting the program...");
                break;
               
        } 
    }
}
