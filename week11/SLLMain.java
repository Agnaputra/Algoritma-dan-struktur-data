package week11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Adding data to the linked list
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();

        list.addLast(4);
        list.addLast(5);
        list.print();

        list.insertAfter(3, 6);
        list.print();

        list.insertBefore(4, 7);
        list.print();

        list.insertAt(2, 8);
        list.print();

        System.out.println("Data at index 3: " + list.getData(3));

        System.out.println("Index of 5: " + list.indexOf(5));

        list.removeFirst();
        list.print();

        list.removeLast();
        list.print();

        list.remove(6);
        list.print();

        list.removeAt(2);
        list.print();
    }
}
