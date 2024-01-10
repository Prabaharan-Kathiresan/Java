public class Program5 {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdgeDGraph(5,2);
        graph.addEdgeDGraph(5,0);
        graph.addEdgeDGraph(4,0);
        graph.addEdgeDGraph(4,1);
        graph.addEdgeDGraph(2,3);
        graph.addEdgeDGraph(3,1);
        graph.printDGraph();
        graph.toplogicalSort();
    }
}