package week6;

public class TicketService {
    Ticket[] tickets;
    int size;

    public TicketService(int capacity) {
        tickets = new Ticket[capacity];
        size = 0;
    }

    public void add(Ticket ticket) {
        if (size < tickets.length) {
            tickets[size++] = ticket;
        } else {
            System.out.println("Ticket service is full.");
        }
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("Ticket " + (i + 1) + ": " + tickets[i]);
        }
    }

    public void bubbleSort(boolean ascending) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if ((ascending && tickets[j].price > tickets[j + 1].price)
                        || (!ascending && tickets[j].price < tickets[j + 1].price)) {
                    Ticket temp = tickets[j];
                    tickets[j] = tickets[j + 1];
                    tickets[j + 1] = temp;
                }
            }
        }
    }
}
