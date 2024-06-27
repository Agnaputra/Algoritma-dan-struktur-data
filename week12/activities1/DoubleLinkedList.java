package week12.activities1;

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
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Index out of bounds");
        }
        if (index == 0) {
            addFirst(item);
        } else {
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
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println("\nSize: " + size);
        } else {
            System.out.println("Linked List is empty");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List is empty, cannot remove");
        } else if (size == 1) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List is empty, cannot remove");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
                current.prev.next = current.next;
            } else {
                current.prev.next = null;
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List is empty");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List is empty");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}