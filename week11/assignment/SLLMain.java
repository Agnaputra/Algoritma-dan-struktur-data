package week11.assignment;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Adding data to the linked list
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();  // Output: Linked list content:  1 2 3

        list.addLast(4);
        list.addLast(5);
        list.print();  // Output: Linked list content:  1 2 3 4 5

        list.insertAfter(3, 6);
        list.print();  // Output: Linked list content:  1 2 3 6 4 5

        list.insertBefore(4, 7);
        list.print();  // Output: Linked list content:  1 2 3 6 7 4 5

        list.insertAt(2, 8);
        list.print();  // Output: Linked list content:  1 2 8 3 6 7 4 5
    }
}