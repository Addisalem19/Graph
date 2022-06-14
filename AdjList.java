import java.util.LinkedList;

class AdjList {
  public LinkedList<Integer> adjLists[];

  // Add edge
  static void addEdge(LinkedList<LinkedList<Integer>> a, int s, int d) {
    a.get(s).add(d);
    a.get(d).add(s);
  }
  // Print the graph
  static void printGraph(LinkedList<LinkedList<Integer>> a) {
    for (int i = 0; i < a.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < a.get(i).size(); j++) {
        System.out.print(" -> " + a.get(i).get(j));
      }
      System.out.println();
    }
  }
}