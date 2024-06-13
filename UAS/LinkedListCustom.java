package UAS;

public class LinkedListCustom<T> {
    private Node<T> head;
    private int size;

    public LinkedListCustom() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void sort(java.util.Comparator<? super T> c) {
        if (size > 1) {
            for (boolean wasChanged = true; wasChanged; ) {
                Node<T> current = head;
                Node<T> previous = null;
                Node<T> next = head.next;
                wasChanged = false;

                while (next != null) {
                    if (c.compare(current.data, next.data) > 0) {
                        wasChanged = true;

                        if (previous != null) {
                            Node<T> temp = next.next;
                            previous.next = next;
                            next.next = current;
                            current.next = temp;
                        } else {
                            head = next;
                            current.next = next.next;
                            next.next = current;
                        }

                        previous = next;
                        next = current.next;
                    } else {
                        previous = current;
                        current = next;
                        next = next.next;
                    }
                }
            }
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
