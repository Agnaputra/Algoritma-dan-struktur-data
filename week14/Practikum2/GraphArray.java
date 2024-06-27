package week14.Practikum2;

public class GraphArray {
    public int vertices;
    public int[][] adjMatrix;

    public GraphArray(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdge(int from, int to) {
        adjMatrix[from - 1][to - 1] = 1; // adjust for 0-based index
    }

    public void printGraph() {
        System.out.print("   ");
        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < vertices; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(" " + adjMatrix[i][j]);
            }
            System.out.println();
        }
    }
}