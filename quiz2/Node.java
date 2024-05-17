package quiz2;

public class Node {
    int data; // Value held by the node
    Node n;   // Reference to the next node in the list
    Node p;   // Reference to the previous node in the list
    
    // Default constructor
    public Node() {
        data = 0; // Initialize data to 0
        n = null; // Initialize next node reference to null
        p = null; // Initialize previous node reference to null
    }
    
    // Constructor with data parameter
    Node(int data) {
        this.data = data; // Set the data
        n = null; // Initialize next node reference to null
        p = null; // Initialize previous node reference to null
    }
    
    // Constructor with references to the previous and next nodes, and the data
    Node(Node prev, int data, Node next) {
        this.data = data; // Set the data
        this.n = next; // Set the next node reference
        this.p = prev; // Set the previous node reference
    }
    
}
