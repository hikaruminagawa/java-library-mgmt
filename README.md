This Java program represents a simple library management system. The `Library` class is the main class of the program. It maintains three arrays: `titles` for book titles, `authors` for authors of the books, and `quantities` for the number of copies of each book available in the library. The indices of these arrays are aligned, meaning that for any given index `i`, `titles[i]`, `authors[i]`, and `quantities[i]` all refer to the same book.

The `main` method starts by initializing these arrays with some pre-defined values. Then, it creates a `Scanner` object, `scanner`, to read user input from the console.

The user is prompted to enter an action: `1` for adding a book, `2` for borrowing a book, `3` for returning a book, and `4` for exiting the program. The entered action is read using `scanner.nextInt()`, and the newline character following the entered number is consumed using `scanner.nextLine()`.

The program then declares some variables to store the title, author, and quantity of a book, as well as a boolean flag `bookExists` to check if a book exists in the library.

A `switch` statement is used to handle the different actions based on the user's input. 

- If the user enters `1`, they are prompted to enter the title, author, and quantity of a book. The program checks if the book already exists in the library. If it does, the quantity of the book is updated. If it doesn't, the book is added to the library by extending the arrays and adding the new book's details at the end.

- If the user enters `2`, they are prompted to enter the title and author of a book to borrow. If the book exists and the requested quantity is available, the quantity of the book is decreased. If the book doesn't exist or the requested quantity is not available, an appropriate message is displayed.

- If the user enters `3`, they are prompted to enter the title and author of a book to return. If the book exists, the quantity of the book is increased. If the book doesn't exist, a message is displayed.

- If the user enters `4`, a message is displayed and the program exits.

- If the user enters any other number, an error message is displayed.
