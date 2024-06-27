package week11.assignment;


public class SingleLinkedList {
    private Node head;
    private Node tail;

    // Node class definition
    private class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Print the contents of the linked list
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    // Add a node to the beginning of the list
    public void addFirst(int input) {
        Node ndInput = new Node(input, head);
        if (isEmpty()) {
            tail = ndInput;
        }
        head = ndInput;
    }

    // Add a node to the end of the list
    public void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }

    // Insert a node after a specific key
    public void insertAfter(int key, int input) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                Node ndInput = new Node(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key not found");
    }

    // Insert a node before a specific key
    public void insertBefore(int key, int input) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot insert data.");
            return;
        }

        if (head.data == key) {
            addFirst(input);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            Node ndInput = new Node(input, temp.next);
            temp.next = ndInput;
        } else {
            System.out.println("Key not found");
        }
    }

    // Insert a node at a specific index
    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
            return;
        }
        if (index == 0) {
            addFirst(input);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                System.out.println("Index out of bounds");
                return;
            }
        }
        if (temp != null) {
            Node ndInput = new Node(input, temp.next);
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Get data at a specific index
    public int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp != null) {
                tmp = tmp.next;
            } else {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
        if (tmp != null) {
            return tmp.data;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    // Get the index of a specific key
    public int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == key) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    // Remove the first node
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    // Remove the last node
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    // Remove a node with a specific key
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            if (head.data == key) {
                removeFirst();
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            } else {
                System.out.println("Key not found");
            }
        }
    }

    // Remove a node at a specific index
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Index out of bounds");
                    return;
                }
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            } else {
                System.out.println("Index out of bounds");
            }
        }
    }
}
