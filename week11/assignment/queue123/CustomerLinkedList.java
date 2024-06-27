package week11.assignment.queue123;

public class CustomerLinkedList {
    private CustomerNode head;
    private CustomerNode tail;

    private class CustomerNode {
        Customer customer;
        CustomerNode next;

        public CustomerNode(Customer customer, CustomerNode next) {
            this.customer = customer;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(String name, String address, int accountNumber) {
        Customer customer = new Customer(name, address, accountNumber);
        CustomerNode newNode = new CustomerNode(customer, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        CustomerNode current = head;
        System.out.println("Queue contents:");
        while (current != null) {
            System.out.println(current.customer);
            current = current.next;
        }
    }
}
