package week11.assignment.queue123;

public class Queue {
    private CustomerLinkedList list = new CustomerLinkedList();

    public void enqueue(String name, String address, int accountNumber) {
        list.addLast(name, address, accountNumber);
    }

    public void dequeue() {
        list.removeFirst();
    }

    public void printQueue() {
        list.print();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("Alice", "123 Street A", 1001);
        queue.enqueue("Bob", "456 Street B", 1002);
        queue.enqueue("Charlie", "789 Street C", 1003);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();
    }
}
