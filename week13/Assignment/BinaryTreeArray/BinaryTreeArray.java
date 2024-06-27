package week13.Assignment.BinaryTreeArray;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray(int size) {
        data = new int[size];
        idxLast = -1;
    }

    public void populateData(int value) {
        if (idxLast < data.length - 1) {
            data[++idxLast] = value;
        }
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // Assignment 5: Add method to enter data into the tree
    public void add(int value) {
        if (idxLast < data.length - 1) {
            data[++idxLast] = value;
        }
    }

    // Assignment 6: Pre-Order Traversal
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    // Assignment 6: Post-Order Traversal
    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}

