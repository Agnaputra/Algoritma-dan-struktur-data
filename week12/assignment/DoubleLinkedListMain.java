package week12.assignment;

import java.util.Scanner;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value, index;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add at Index");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove at Index");
            System.out.println("7. Print List");
            System.out.println("8. Get First");
            System.out.println("9. Get Last");
            System.out.println("10. Get at Index");
            System.out.println("11. Clear List");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = scanner.nextInt();
                    dll.addFirst(value);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    value = scanner.nextInt();
                    dll.addLast(value);
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    value = scanner.nextInt();
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    dll.add(value, index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    dll.remove(index);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("First element: " + dll.getFirst());
                    break;
                case 9:
                    System.out.println("Last element: " + dll.getLast());
                    break;
                case 10:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    System.out.println("Element at index " + index + ": " + dll.get(index));
                    break;
                case 11:
                    dll.clear();
                    break;
                case 12:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 12);
        scanner.close();
    }
}
