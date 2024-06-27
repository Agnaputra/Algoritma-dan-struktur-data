package week13.Assignment.BinaryTree;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse In-Order");
            System.out.println("5. Traverse Pre-Order");
            System.out.println("6. Traverse Post-Order");
            System.out.println("7. Display Smallest Value");
            System.out.println("8. Display Largest Value");
            System.out.println("9. Display Leaves");
            System.out.println("10. Count Leaves");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    value = scanner.nextInt();
                    bt.add(value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    bt.delete(value);
                    break;
                case 3:
                    System.out.print("Enter value to find: ");
                    value = scanner.nextInt();
                    System.out.println("Find result: " + bt.find(value));
                    break;
                case 4:
                    System.out.println("In-Order Traversal:");
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Pre-Order Traversal:");
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Post-Order Traversal:");
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Smallest Value: " + bt.findMin());
                    break;
                case 8:
                    System.out.println("Largest Value: " + bt.findMax());
                    break;
                case 9:
                    System.out.println("Leaf Nodes:");
                    bt.displayLeaves(bt.root);
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Number of Leaves: " + bt.countLeaves(bt.root));
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 11);

        scanner.close();
    }
}

