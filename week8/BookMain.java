package week8;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Stack2 stk = new Stack2(5);
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Choose operation: 1. Push 2. Pop 3. Peek 4. Print 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter published year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter pages amount: ");
                    int pages = sc.nextInt();
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    Book book = new Book(title, author, year, pages, price);
                    stk.push(book);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
