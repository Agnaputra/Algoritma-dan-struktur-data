package week13.Assignment.BinaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    public boolean find(int data) {
        return findRecursive(root, data);
    }

    private boolean findRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        return data < current.data ? findRecursive(current.left, data) : findRecursive(current.right, data);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }
        if (data == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            Node successor = getSuccessor(current);
            current.data = successor.data;
            current.right = deleteRecursive(current.right, successor.data);
            return current;
        }
        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }
        current.right = deleteRecursive(current.right, data);
        return current;
    }

    // Assignment 1: Add Nodes Recursively
    public void addRecursiveMethod(int data) {
        root = addRecursive(root, data);
    }

    // Assignment 2: Display Smallest and Largest Values
    public int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node current) {
        return current.left == null ? current.data : findMinRecursive(current.left);
    }

    public int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node current) {
        return current.right == null ? current.data : findMaxRecursive(current.right);
    }

    // Assignment 3: Display Data in the Leaf
    public void displayLeaves(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            displayLeaves(node.left);
            displayLeaves(node.right);
        }
    }

    // Assignment 4: Display Number of Leaves
    public int countLeaves(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
