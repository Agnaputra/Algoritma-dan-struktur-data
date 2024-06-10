package week8.ASSIGNMENT;
import java.util.Scanner;
public class ReceiptManager {
    public static void main(String[] args) {
        ReceiptStack receiptStack = new ReceiptStack(8);
        Scanner sc = new Scanner(System.in);

        // Adding 8 receipts
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Transaction ID: ");
            String transactionID = sc.nextLine();
            System.out.print("Enter Date: ");
            String date = sc.nextLine();
            System.out.print("Enter Quantity of items: ");
            int quantity = sc.nextInt();
            System.out.print("Enter Total Price: ");
            double totalPrice = sc.nextDouble();
            sc.nextLine();  // consume the remaining newline

            Receipt receipt = new Receipt(transactionID, date, quantity, totalPrice);
            receiptStack.push(receipt);
        }

        // Retrieving 5 receipts to exchange for a voucher
        System.out.println("Retrieving 5 receipts for exchange:");
        for (int i = 0; i < 5; i++) {
            System.out.println(receiptStack.pop());
        }

        // Printing remaining receipts
        System.out.println("Remaining receipts in the stack:");
        receiptStack.printStack();
    }
}
