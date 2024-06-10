package week8;

public class Stack2 {
    int size;
    int top;
    Book[] data;

    public Stack2(int size) {
        this.size = size;
        this.data = new Book[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Book book) {
        if (!isFull()) {
            data[++top] = book;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            --top;
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Top element is: " + data[top]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.println(data[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void clear() {
        top = -1;
    }
}
