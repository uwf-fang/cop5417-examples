import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
    private DijkstraShortestPath() {
        // Private constructor to prevent instantiation of this utility class
    }

    // Computes the shortest path from the source vertex to all other vertices
    // in the graph
    // Returns values by modifying the distTo and parent arrays
    public static void shortestPath(WeightedDigraph graph, int source, int[] distTo, int[] parent) {
        int V = graph.V();
        Arrays.fill(distTo, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        distTo[source] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int v = node.vertex;

            if (distTo[v] < node.distance) {
                continue; // Skip outdated entries in the priority queue
            }

            for (WeightedDigraph.WeightedEdge edge : graph.adj(v)) {
                int w = edge.getTarget();
                int weight = edge.getWeight();

                if (distTo[v] + weight < distTo[w]) {
                    distTo[w] = distTo[v] + weight;
                    parent[w] = v;
                    pq.offer(new Node(w, distTo[w]));
                }
            }
        }
    }

    // Computes the shortest path from the source vertex to all other vertices
    public static int[] getDistances(WeightedDigraph graph, int source) {
        int V = graph.V();
        int[] distTo = new int[V];
        int[] parent = new int[V];
        shortestPath(graph, source, distTo, parent);
        return distTo;
    }

    // Computes the shortest path from the source vertex to the destination
    // vertex
    public static List<Integer> getPath(WeightedDigraph graph, int source, int destination) {
        int V = graph.V();
        int[] distTo = new int[V];
        int[] parent = new int[V];
        shortestPath(graph, source, distTo, parent);

        List<Integer> path = new ArrayList<>();
        for (int v = destination; v != -1; v = parent[v]) {
            path.add(0, v);
        }
        return path;
    }

    // Nested class to represent a node in the priority queue
    // It implements Comparable so that we can use it in a PriorityQueue
    private static class Node implements Comparable<Node> {
        private int vertex;
        private int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}
