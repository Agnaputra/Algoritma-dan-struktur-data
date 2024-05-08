package week8;

public class Stack2 {
    int size;
    int top;
    Book data[];

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
    

    public void push(Book dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }
    

    public void pop() {
        if (!isEmpty()) {
            Book book = data[top--];
            System.out.println("Removed book: " + book.title + " by " + book.authorName + " (" + book.publishedYear + ")");
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            Book book = data[top];
            System.out.println("Top book: " + book.title + " by " + book.authorName + " (" + book.publishedYear + ")");
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        System.out.println("Stack content:");
        for (int i = top; i >= 0; i--) {
            Book book = data[i];
            System.out.println(book.title + " by " + book.authorName + " (" + book.publishedYear + "), Pages: " + book.pagesAmount + ", Price: $" + book.price);
        }
    }

    public void clear() {
        top = -1;
        System.out.println("Stack is now empty");
    }
}
