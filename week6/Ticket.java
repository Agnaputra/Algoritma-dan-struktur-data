package week6;

public class Ticket {
    String airlines;
    int price;
    String destination;
    String origin;

    public Ticket(String airlines, String destination, String origin, int price) {
        this.airlines = airlines;
        this.destination = destination;
        this.origin = origin;
        this.price = price;
    }

    
    public String toString() {
        return "Airlines: " + airlines + ", Destination: " + destination + ", Origin: " + origin + ", Price: " + price;
    }
}


