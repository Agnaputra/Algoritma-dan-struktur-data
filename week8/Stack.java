package week8;

public class Stack {
    int size;
    int top;
    int data[];

    public Stack (int size) {
        this.size =size;
        data = new int[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(int dt) {
        if(!IsFull()) {
            top++;
            data[top] = dt;
        }else {
            System.out.println("Stack is full");
        }
    }
    public void pop() {
        if(!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Remove data : " + x );
        }else{
            System.out.println("Stack is empty");
        }
    }
    
    
}
