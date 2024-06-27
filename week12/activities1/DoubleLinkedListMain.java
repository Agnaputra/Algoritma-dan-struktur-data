package week12.activities1;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();

        dll.removeFirst();
        dll.print();

        dll.removeLast();
        dll.print();

        dll.add(10, 1);
        dll.print();

        System.out.println("First element: " + dll.getFirst());
        System.out.println("Last element: " + dll.getLast());
        System.out.println("Element at index 2: " + dll.get(2));
    }
}
