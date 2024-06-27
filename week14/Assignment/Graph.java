package week14.Assignment;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph<T> {
    private LinkedList<T>[] adjLists;
    private boolean isDirected;

    public Graph(int vertices, boolean isDirected) {
        this.isDirected = isDirected;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(T src, T dest) {
        adjLists[(int) src].add(dest);
        if (!isDirected) {
            adjLists[(int) dest].add(src);
        }
    }

    public void removeEdge(T src, T dest) {
        adjLists[(int) src].remove(dest);
        if (!isDirected) {
            adjLists[(int) dest].remove(src);
        }
    }

    public void printGraph() {
        for (int i = 0; i < adjLists.length; i++) {
            System.out.print(i + " is connected to: ");
            for (T vertex : adjLists[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.println("Is the graph directed? (true/false): ");
        boolean isDirected = scanner.nextBoolean();

        Graph<Integer> graph = new Graph<>(vertices, isDirected);

        System.out.println("Enter number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter edges (format: src dest): ");
        for (int i = 0; i < edges; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            graph.addEdge(src, dest);
        }

        graph.printGraph();
    }
}

