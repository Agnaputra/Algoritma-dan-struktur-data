package week9;

public class Queue {
    int max, size, front, rear;
    int[] Q;

    // Constructor
    public Queue(int max) {
        this.max = max;
        Q = new int[max];
        create();
    }

    // Create method
    public void create() {
        size = 0;
        front = rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == max;
    }

    // Peek method to display the front element
    public void peek() {
        if (!isEmpty()) {
            System.out.println("The first element: " + Q[front]);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    // Print method to display all elements in the queue
    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.print(Q[(front + i) % max] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }
    }

    // Clear method to remove all elements from the queue
    public void clear() {
        create();
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int data) {
        if (!isFull()) {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % max;
            Q[rear] = data;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    // Dequeue method to remove an element from the queue
    public int dequeue() {
        if (!isEmpty()) {
            int data = Q[front];
            front = (front + 1) % max;
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }
            return data;
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }
}
