package week11;

public class CustomerNode {
    String name;
    String address;
    int customerAccountNumber;
    CustomerNode next;

    CustomerNode(String name, String address, int customerAccountNumber, CustomerNode next) {
        this.name = name;
        this.address = address;
        this.customerAccountNumber = customerAccountNumber;
        this.next = next;
    }
}
