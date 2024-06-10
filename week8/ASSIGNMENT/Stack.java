package week8.ASSIGNMENT;

public class Stack {
    private int size;
    private int top;
    private char[] data;

    public Stack(int size) {
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(char c) {
        if (!isFull()) {
            data[++top] = c;
        } else {
            System.out.println("Stack is full");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack is empty");
            return '\0';
        }
    }
}
