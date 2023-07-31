import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Weighted directed graph implementation using adjacency lists. Each edge has
 * an associated weight.
 *
 * Note: This implementation assumes non-negative weights. If you need to
 * handle negative weights, you may consider using a different representation.
 *
 * @author Ian Fang
 */
public class WeightedDigraph {
    private int V;
    private List<Set<WeightedEdge>> adj;

    public WeightedDigraph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new TreeSet<>());
        }
    }

    public void addEdge(int v, int w, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }

        adj.get(v).add(new WeightedEdge(w, weight));
    }

    public Iterable<WeightedEdge> adj(int v) {
        return adj.get(v);
    }

    public int V() {
        return V;
    }

    public int E() {
        int E = 0;
        for (int v = 0; v < V; v++) {
            E += adj.get(v).size();
        }
        return E;
    }

    public String toString() {
        String s = V + " vertices, " + E() + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (WeightedEdge edge : adj.get(v)) {
                int w = edge.target;
                int weight = edge.weight;
                s += "(" + w + ", " + weight + ") ";
            }
            s += "\n";
        }
        return s;
    }

    // Nested class to represent a weighted edge
    // It implements Comparable so that we can use it in a TreeSet
    public static class WeightedEdge implements Comparable<WeightedEdge> {
        private int target;
        private int weight;

        public WeightedEdge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }

        public int getTarget() {
            return target;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public int compareTo(WeightedEdge other) {
            return Integer.compare(this.target, other.target);
        }
    }
}
