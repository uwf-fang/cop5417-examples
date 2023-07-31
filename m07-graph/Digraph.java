import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Directed graph implementation using adjacency lists.
 * @author Ian Fang
 */
public class Digraph {
    private int V;
    private List<Set<Integer>> adj;
    public Digraph(int V) {
        this.V = V;
        adj = new ArrayList<Set<Integer>>();
        for (int i = 0; i < V; i++)
            adj.add(new TreeSet<Integer>());
    }
    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }
    public Iterable<Integer> adj(int v) {
        return adj.get(v);
    }
    public int V() {
        return V;
    }
    public int E() {
        int E = 0;
        for (int v = 0; v < V; v++)
            E += adj.get(v).size();
        return E;
    }
    public String toString() {
        String s = V + " vertices, " + E() + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (int w : adj.get(v))
                s += w + " ";
            s += "\n";
        }
        return s;
    }
}
