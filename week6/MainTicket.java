package week6;

public class MainTicket {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();

        ticketService.add(new Ticket("Airline1", "Destination1", "Origin1", 200));
        ticketService.add(new Ticket("Airline2", "Destination2", "Origin2", 150));
        ticketService.add(new Ticket("Airline3", "Destination3", "Origin3", 300));
        ticketService.add(new Ticket("Airline4", "Destination4", "Origin4", 100));

        System.out.println("Unsorted Tickets:");
        ticketService.displayAll();
        System.out.println();

        ticketService.bubbleSort();
        System.out.println("Tickets sorted by price (ascending order) using Bubble Sort:");
        ticketService.displayAll();
        System.out.println();

        ticketService.selectionSort();
        System.out.println("Tickets sorted by price (descending order) using Selection Sort:");
        ticketService.displayAll();
    }
}

