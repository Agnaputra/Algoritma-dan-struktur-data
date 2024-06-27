package week12.activities2;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();

        // Initial list setup
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println("Size: " + dll.size());

        // Additional test cases
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: " + dll.size());

        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size());

        dll.removeLast();
        dll.print();
        System.out.println("Size: " + dll.size());

        dll.remove(1);
        dll.print();
        System.out.println("Size: " + dll.size());
    }
}