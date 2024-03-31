package week6;

import java.util.Arrays;

public class TicketService {
    Ticket[] tickets;
    int size;

    public TicketService() {
        tickets = new Ticket[100];
        size = 0;
    }

    public void add(Ticket t) {
        tickets[size++] = t;
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(tickets[i]);
        }
    }

    // Bubble sort
    public void bubbleSort() {
        Arrays.sort(tickets, 0, size, (a, b) -> a.price - b.price);
    }

    // Selection sort
    public void selectionSort() {
        Arrays.sort(tickets, 0, size, (a, b) -> b.price - a.price);
    }
}
    

