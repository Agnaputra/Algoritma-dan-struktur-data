package week14.Practikum2;
import java.util.Scanner;
public class GraphArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertices: ");
        int vertices = scanner.nextInt();

        GraphArray graph = new GraphArray(vertices);

        System.out.print("Masukkan jumlah edges: ");
        int edges = scanner.nextInt();

        System.out.println("Masukkan edges: <from> <to>");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            graph.addEdge(from, to);
        }

        System.out.println("Array 2D sebagai representasi graph sbb:");
        graph.printGraph();

        scanner.close();
    }
}
