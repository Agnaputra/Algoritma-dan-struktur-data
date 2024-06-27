package week11.assignment.no3;

class Stack {
    private Node head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        String poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return head.data;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
