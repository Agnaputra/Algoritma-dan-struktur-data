package week8.ASSIGNMENT;

public class Receipt {
    String transactionID;
    String date;
    int quantity;
    double totalPrice;

    public Receipt(String transactionID, String date, int quantity, double totalPrice) {
        this.transactionID = transactionID;
        this.date = date;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionID + ", Date: " + date + ", Quantity: " + quantity + ", Total Price: " + totalPrice;
    }
}
