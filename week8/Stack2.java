package week8;

public class Stack2 {
    private int size;
    private int top;
    private Book[] data;

    public Stack2(int size) {
        this.size = size;
        data = new Book[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Book book) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push book: " + book);
        } else {
            data[++top] = book;
            System.out.println("Pushed book: " + book);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Book book = data[top--];
            System.out.println("Removed book: " + book);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Book book = data[top];
            System.out.println("Top book: " + book);
        }
    }

    public void print() {
        System.out.println("Stack content:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public void clear() {
        top = -1;
        System.out.println("Stack is now empty");
    }
}
