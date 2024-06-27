package week14.Practikum1;

public class Graph {
    int vertices;
    LinkedList[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList();
        }
    }

    public void addEdge(int from, int to) {
        if (from < vertices && to < vertices) {
            adjList[from].addFirst(to);
        }
    }

    public void removeEdge(int from, int to) {
        if (from < vertices && to < vertices) {
            adjList[from].remove(to);
        }
    }

    public void removeAllEdges(int vertex) {
        if (vertex < vertices) {
            adjList[vertex] = new LinkedList();
        }
    }

    public int degree(int vertex) {
        if (vertex < vertices) {
            Node current = adjList[vertex].head;
            int degree = 0;
            while (current != null) {
                degree++;
                current = current.next;
            }
            return degree;
        }
        return 0;
    }

    public int indegree(int vertex) {
        int indegree = 0;
        for (int i = 0; i < vertices; i++) {
            if (adjList[i].contains(vertex)) {
                indegree++;
            }
        }
        return indegree;
    }

    public int outdegree(int vertex) {
        return degree(vertex);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " terhubung dengan: ");
            adjList[i].print();
            System.out.println();
        }
    }
}