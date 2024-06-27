package week12.activities3;

public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        Node newNode = new Node(null, item, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(current, item, null);
        current.next = newNode;
        size++;
    }

    public void add(int item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(item);
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(current, item, current.next);
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        size--;
    }

    public int getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        return head.data;
    }

    public int getLast() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
}