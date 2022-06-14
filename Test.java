import java.util.LinkedList;

class Test {
    public static void main(String[] args) {

        Graph g = new Graph(4);
     
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    
        System.out.println("\nFollowing is Breadth First Traversal");
    
        g.BFS(2);
    
        System.out.println("\n\nFollowing is Depth First Traversal");
    
        g.DFS(2);
    
    
        // Create the graph
        int V = 5;
        LinkedList<LinkedList<Integer>> a = new LinkedList<LinkedList<Integer>>();
    
        for (int i = 0; i < V; i++)
          a.add(new LinkedList<Integer>());
    
          System.out.print("\n\nAdjucency List form");
        // Add edges
        addEdge(a, 0, 1);
        addEdge(a, 0, 2);
        addEdge(a, 0, 3);
        addEdge(a, 1, 2);
    
        printGraph(a);
        
        System.out.println("\nAdjucency Matrix form");
        AdjMatrix m = new AdjMatrix(4);
          
              m.addEdge(0, 1);
              m.addEdge(0, 2);
              m.addEdge(1, 2);
              m.addEdge(2, 0);
              m.addEdge(2, 3);
          
              System.out.print(m.toString());
    
              System.out.println("\nPrim's shortest path");
              PMST t = new PMST();
              int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                            { 2, 0, 3, 8, 5 },
                                            { 0, 3, 0, 0, 7 },
                                            { 6, 8, 0, 0, 9 },
                                            { 0, 5, 7, 9, 0 } };
              t.primMST(graph);
    
              System.out.println("\nDijksta's shortest path");
              int dijkstra[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
              { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
              { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
              { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
              { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
              { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
              { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
              { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
              { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
    ShortestPath d = new ShortestPath();
    d.dijkstra(dijkstra, 0);
      }

    private static void printGraph(LinkedList<LinkedList<Integer>> a) {
    }

    private static void addEdge(LinkedList<LinkedList<Integer>> a, int i, int j) {
    }
}