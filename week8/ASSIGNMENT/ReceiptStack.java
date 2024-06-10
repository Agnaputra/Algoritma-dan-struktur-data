package week8.ASSIGNMENT;

public class ReceiptStack {
    int size;
    int top;
    Receipt[] data;

    public ReceiptStack(int size) {
        this.size = size;
        this.data = new Receipt[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Receipt receipt) {
        if (!isFull()) {
            data[++top] = receipt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public Receipt pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }
    }
}

