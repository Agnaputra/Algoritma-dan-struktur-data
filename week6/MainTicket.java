package week6;
import java.util.Scanner;

public class MainTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        TicketService ticketService = new TicketService(numTickets);

        for (int i = 0; i < numTickets; i++) {
            System.out.println("\nEnter details for Ticket " + (i + 1) + ":");
            System.out.print("Airlines: ");
            String airlines = scanner.nextLine();
            System.out.print("Destination: ");
            String destination = scanner.nextLine();
            System.out.print("Origin: ");
            String origin = scanner.nextLine();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Ticket ticket = new Ticket(airlines, destination, origin, price);
            ticketService.add(ticket);
        }

        System.out.println("\nDisplaying all tickets:");
        ticketService.displayAll();

        // Sorting options
        System.out.println("\nSort by price:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Enter your choice (1/2): ");
        int sortChoice = scanner.nextInt();
        boolean ascending = sortChoice == 1;

        // Sorting tickets by price
        ticketService.bubbleSort(ascending);
        System.out.println("\nTickets sorted by price:");
        ticketService.displayAll();

        scanner.close();
    }
}


