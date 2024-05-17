package quiz2;

public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    }

    void deleteFirst() {
        if (!isEmpty()) {
            head = head.n;
            if (head != null) {
                head.p = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.n;
        }
        System.out.println("");
    }

    void addLast(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            tail.n = nu;
            nu.p = tail;
            tail = nu;
        }
        size++;
    }

    void deleteLast() {
        if (!isEmpty()) {
            tail = tail.p;
            if (tail != null) {
                tail.n = null;
            } else {
                head = null;
            }
            size--;
        }
    }

    void printFromTail() {
        Node tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.p;
        }
        System.out.println("");
    }

    int getPositionFromTail(int data) {
        Node tmp = tail;
        int position = 1;
        while (tmp != null) {
            if (tmp.data == data) {
                return position;
            }
            tmp = tmp.p;
            position++;
        }
        return -1; // return -1 if data is not found
    }

    int getLastPositionFromTail(int data) {
        Node tmp = tail;
        int position = 1;
        while (tmp != null) {
            if (tmp.data == data) {
                return position;
            }
            tmp = tmp.p;
            position++;
        }
        return -1; // return -1 if data is not found
    }

    double getAverage() {
        if (isEmpty()) {
            return 0;
        }
        Node tmp = head;
        double sum = 0;
        while (tmp != null) {
            sum += tmp.data;
            tmp = tmp.n;
        }
        return sum / size;
    }

    Node getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.n;
        }
        return tmp;
    }

    void sort() {
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                Node current = head;
                Node next = current.n;
                for (int j = 0; j < size - 1 - i; j++) {
                    if (current.data > next.data) {
                        int temp = current.data;
                        current.data = next.data;
                        next.data = temp;
                    }
                    current = next;
                    next = next.n;
                }
            }
        }
    }

    double getMedian() {
        if (isEmpty()) {
            return 0;
        }
        sort();
        if (size % 2 == 1) {
            return getNodeByIndex(size / 2).data;
        } else {
            Node mid1 = getNodeByIndex(size / 2 - 1);
            Node mid2 = getNodeByIndex(size / 2);
            return (mid1.data + mid2.data) / 2.0;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        
        dll.addLast(5);
        dll.print();
        dll.deleteLast();
        dll.print();
        
        dll.printFromTail();
        
        System.out.println("Position from tail of 10: " + dll.getPositionFromTail(10));
        System.out.println("Last position from tail of 10: " + dll.getLastPositionFromTail(10));
        
        System.out.println("Average: " + dll.getAverage());
        System.out.println("Median: " + dll.getMedian());
    }
}


