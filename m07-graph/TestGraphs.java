public class TestGraphs {
    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        Digraph g2 = new Digraph(5);
        AdjMatGraph g3 = new AdjMatGraph(5);
        WeightedDigraph g4 = new WeightedDigraph(5);

        // initialize g1
        // 0 -- 1 -- 4
        // |    |
        // 2 -- 3

        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 3);
        g1.addEdge(1, 4);
        g1.addEdge(2, 3);

        // initialize g2
        // 0 -> 1 -> 4
        // |    |
        // v    v
        // 2 -> 3

        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 3);
        g2.addEdge(1, 4);
        g2.addEdge(2, 3);

        // initialize g3 to same as g2

        g3.addEdge(0, 1);
        g3.addEdge(0, 2);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(2, 3);

        // initialize g4
        //   1    4
        // 0 -> 1 -> 4
        // | 2  | 3
        // v    v
        // 2 -> 3
        //   5
        g4.addEdge(0, 1, 1);
        g4.addEdge(0, 2, 2);
        g4.addEdge(1, 3, 3);
        g4.addEdge(1, 4, 4);
        g4.addEdge(2, 3, 5);

        System.out.println("g1: " + g1);
        System.out.println("g2: " + g2);
        System.out.println("g3: " + g3);
        System.out.println("g4: " + g4);
    }

}
