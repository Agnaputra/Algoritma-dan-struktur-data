package week9;

import java.util.Scanner;

public class MainPassengers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int max = sc.nextInt();
        QueuePassenger queuePassenger = new QueuePassenger(max); // Corrected instantiation

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter city of origin: ");
                    String cityOrigin = sc.nextLine();
                    System.out.print("Enter city of destination: ");
                    String cityDestination = sc.nextLine();
                    System.out.print("Enter ticket amount: ");
                    int ticketAmount = sc.nextInt();
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    Passengers p = new Passengers(name, cityOrigin, cityDestination, ticketAmount, price);
                    queuePassenger.enqueue(p);
                    break;
                case 2:
                    Passengers dequeuedPassenger = queuePassenger.dequeue();
                    if (dequeuedPassenger != null) {
                        System.out.println("Dequeued passenger: " + dequeuedPassenger.name);
                    }
                    break;
                case 3:
                    queuePassenger.peek();
                    break;
                case 4:
                    queuePassenger.print();
                    break;
                case 5:
                    queuePassenger.clear();
                    break;
            }
        } while (choice != 6);
    }
}
