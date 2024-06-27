package week13.Assignment.BinaryTreeArray;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray(10);
        bta.populateData(6);
        bta.populateData(4);
        bta.populateData(8);
        bta.populateData(3);
        bta.populateData(5);
        bta.populateData(7);
        bta.populateData(9);

        System.out.println("In-Order Traversal:");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.println("Pre-Order Traversal:");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.println("Post-Order Traversal:");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
