import java.util.ArrayList;
import java.util.List;

/**
 * Directed unweighted graph represented by an adjacency matrix.
 * @author Ian Fang
 */
public class AdjMatGraph {
   private int V;
    private boolean[][] adj;
    public AdjMatGraph(int V) {
        this.V = V;
        adj = new boolean[V][V];
    }
    public void addEdge(int v, int w) {
        adj[v][w] = true;
    }
    public Iterable<Integer> adj(int v) {
        List<Integer> bag = new ArrayList<Integer>();
        for (int w = 0; w < V; w++)
            if (adj[v][w]) bag.add(w);
        return bag;
    }
    public int V() {
        return V;
    }
    public int E() {
        int E = 0;
        for (int v = 0; v < V; v++)
            for (int w = 0; w < V; w++)
                if (adj[v][w]) E++;
        return E;
    }
    public String toString() {
        String s = V + " vertices, " + E() + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (int w = 0; w < V; w++)
                if (adj[v][w]) s += w + " ";
            s += "\n";
        }
        return s;
    }
}
