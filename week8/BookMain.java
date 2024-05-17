package week8;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Stack stack = new Stack(8); // Create a stack with a capacity of 8 books
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author Name: ");
            String authorName = sc.nextLine();

            System.out.print("Published Year: ");
            int publishedYear = sc.nextInt();

            System.out.print("Pages Amount: ");
            int pagesAmount = sc.nextInt();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline

            // Create a new Book object with the input data
            Book book = new Book(title, authorName, publishedYear, pagesAmount, price);

            // Push the book onto the stack
            stack.push(book);

            System.out.print("Do you want to add a new book to the stack (y/n)? ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // Consume the newline character

        } while (choice == 'y' || choice == 'Y');

        // Print the stack content
        stack.print();

        // Perform a pop operation, peek at the top book, and print the updated stack content
        stack.pop();
        stack.peek();
        stack.print();

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
