import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Graph<T> {
    private Map<T, LinkedList<T>> adjLists;
    private boolean isDirected;

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        adjLists = new HashMap<>();
    }

    public void addVertex(T vertex) {
        adjLists.putIfAbsent(vertex, new LinkedList<>());
    }

    public void addEdge(T src, T dest) {
        adjLists.get(src).add(dest);
        if (!isDirected) {
            adjLists.get(dest).add(src);
        }
    }

    public void removeEdge(T src, T dest) {
        LinkedList<T> srcList = adjLists.get(src);
        LinkedList<T> destList = adjLists.get(dest);
        if (srcList != null) {
            srcList.remove(dest);
        }
        if (!isDirected && destList != null) {
            destList.remove(src);
        }
    }

    public void printGraph() {
        for (Map.Entry<T, LinkedList<T>> entry : adjLists.entrySet()) {
            System.out.print(entry.getKey() + " is connected to: ");
            for (T vertex : entry.getValue()) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph<String> graph = new Graph<>(false); // or true for directed graph

        System.out.println("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter vertices: ");
        for (int i = 0; i < vertices; i++) {
            String vertex = scanner.nextLine();
            graph.addVertex(vertex);
        }

        System.out.println("Enter number of edges: ");
        int edges = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter edges (format: src dest): ");
        for (int i = 0; i < edges; i++) {
            String src = scanner.next();
            String dest = scanner.next();
            graph.addEdge(src, dest);
        }
         graph.printGraph();
    }
}
