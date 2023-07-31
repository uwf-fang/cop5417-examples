import java.util.List;

public class TestShortestPath {
    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph
        WeightedDigraph graph = new WeightedDigraph(V);

        // Adding edges to the graph
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 10);
        graph.addEdge(2, 3, 3);
        graph.addEdge(3, 4, 1);

        int sourceVertex = 0;

        int[] distances = DijkstraShortestPath.getDistances(graph, sourceVertex);
        System.out.println("Shortest distances from vertex " + sourceVertex + " to all other vertices:");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + distances[i]);
        }
        List<Integer> path;
        for (int destinationVertex = 1; destinationVertex < V; destinationVertex++) {
            path = DijkstraShortestPath.getPath(graph, sourceVertex, destinationVertex);
            System.out.println("\nShortest path from vertex " + sourceVertex + " to " + destinationVertex + ":");
            for (int vertex : path)
                System.out.print(vertex + " ");
            System.out.println();
        }
    }
}
