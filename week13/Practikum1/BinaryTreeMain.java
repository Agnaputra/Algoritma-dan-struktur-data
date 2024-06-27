package week13.Practikum1;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.println("In-Order Traversal:");
        bt.traverseInOrder(bt.root);
        System.out.println("\nPre-Order Traversal:");
        bt.traversePreOrder(bt.root);
        System.out.println("\nPost-Order Traversal:");
        bt.traversePostOrder(bt.root);

        System.out.println("\nFind 5: " + bt.find(5));
        System.out.println("Find 10: " + bt.find(10));

        bt.delete(5);
        System.out.println("\nAfter deleting 5:");
        bt.traverseInOrder(bt.root);
    }
}
