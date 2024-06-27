package week11;

public class CustomerLinkedList {
    CustomerNode head;
    CustomerNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            CustomerNode tmp = head;
            System.out.print("Customer list content: \n");
            while (tmp != null) {
                System.out.println("Name: " + tmp.name + ", Address: " + tmp.address + ", Account Number: " + tmp.customerAccountNumber);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Customer list is empty");
        }
    }

    public void addFirst(String name, String address, int accountNumber) {
        CustomerNode ndInput = new CustomerNode(name, address, accountNumber, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String name, String address, int accountNumber) {
        CustomerNode ndInput = new CustomerNode(name, address, accountNumber, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, String name, String address, int accountNumber) {
        CustomerNode ndInput = new CustomerNode(name, address, accountNumber, null);
        CustomerNode temp = head;
        while (temp != null) {
            if (temp.customerAccountNumber == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertBefore(int key, String name, String address, int accountNumber) {
        if (isEmpty()) {
            System.out.println("Customer list is empty. Cannot insert data.");
            return;
        }

        if (head.customerAccountNumber == key) {
            addFirst(name, address, accountNumber);
            return;
        }

        CustomerNode temp = head;
        while (temp.next != null && temp.next.customerAccountNumber != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            CustomerNode ndInput = new CustomerNode(name, address, accountNumber, temp.next);
            temp.next = ndInput;
        } else {
            System.out.println("Key not found");
        }
    }

    public void insertAt(int index, String name, String address, int accountNumber) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(name, address, accountNumber);
        } else {
            CustomerNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Index out of bounds");
                    return;
                }
            }
            if (temp != null) {
                temp.next = new CustomerNode(name, address, accountNumber, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Index out of bounds");
            }
        }
    }
}
