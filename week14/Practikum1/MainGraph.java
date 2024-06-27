package week14.Practikum1;

public class MainGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 3);
        graph.addEdge(2, 1);
        graph.addEdge(3, 0);
        graph.addEdge(3, 4);
        graph.addEdge(3, 2);
        graph.addEdge(3, 1);
        graph.addEdge(4, 3);
        graph.addEdge(4, 1);
        graph.addEdge(4, 0);

        graph.printGraph();

        int vertex = 2;
        System.out.println("degree vertex " + vertex + " : " + graph.degree(vertex));
        System.out.println("Indegree dari vertex " + vertex + " : " + graph.indegree(vertex));
        System.out.println("Outdegree dari vertex " + vertex + " : " + graph.outdegree(vertex));
        System.out.println("degree vertex " + vertex + " : " + (graph.indegree(vertex) + graph.outdegree(vertex)));

        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}