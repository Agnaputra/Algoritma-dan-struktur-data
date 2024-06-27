package week11;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerLinkedList list = new CustomerLinkedList();

        // Adding customers to the list
        list.addFirst("Alice", "123 Street A", 1001);
        list.addFirst("Bob", "456 Street B", 1002);
        list.addFirst("Charlie", "789 Street C", 1003);
        list.print();

        list.addLast("David", "101 Street D", 1004);
        list.addLast("Eve", "102 Street E", 1005);
        list.print();

        list.insertAfter(1003, "Frank", "103 Street F", 1006);
        list.print();

        list.insertBefore(1004, "Grace", "104 Street G", 1007);
        list.print();

        list.insertAt(2, "Hank", "105 Street H", 1008);
        list.print();
    }
}
