package week9;

public class QueuePassenger {
    int max;
    int size;
    int front;
    int rear;
    Passengers[] Q;

    public QueuePassenger(int max) {
        this.max = max;
        Q = new Passengers[max];
        create();
    }

    public void create() {
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            Passengers p = Q[front];
            System.out.println("Front element: " + p.name + " from " + p.cityOrigin + " to " + p.cityDestination + ", Tickets: " + p.ticketAmount + ", Price: " + p.price);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            Passengers p = Q[rear];
            System.out.println("Rear element: " + p.name + " from " + p.cityOrigin + " to " + p.cityDestination + ", Tickets: " + p.ticketAmount + ", Price: " + p.price);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                Passengers p = Q[(front + i) % max];
                System.out.println(p.name + " from " + p.cityOrigin + " to " + p.cityDestination + ", Tickets: " + p.ticketAmount + ", Price: " + p.price);
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void clear() {
        create();
    }

    public void queue(Passengers p) {
        if (!isFull()) {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % max;
            Q[rear] = p;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public Passengers dequeue() {
        if (!isEmpty()) {
            Passengers p = Q[front];
            front = (front + 1) % max;
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }
            return p;
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }
}
