package week8;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author Name: ");
            String name = sc.nextLine();

            System.out.print("Published Year: ");
            int year = sc.nextInt();

            System.out.print("Pages Amount: ");
            int pages = sc.nextInt();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline

            Book bk = new Book(title, name, year, pages, price);
            stack.push(bk);

            System.out.print("Do you want to add a new book to the stack (y/n)? ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // Consume newline

        } while (choice == 'y');

        stack.print();
        sc.close();
    }
}
