import java.util.*;
import java.util.Map.Entry;
/**
 * create a graph using adjList
 * Vertices are bob,alice,mark,maria,rob
 * 
 */
public class Program1 {

    public static Map<String,ArrayList<String>> adjMap = new HashMap();

    public static void main(String args[]){
        addVertex("bob");
        addVertex("alice");
        addVertex("mark");
        addVertex("maria");
        addVertex("rob");
        addEdge("bob","alice");
        addEdge("bob","rob");
        addEdge("alice","maria");
        addEdge("alice","mark");
        addEdge("maria","rob");
            
        addEdge("rob","mark");        
        
        printGraph();

        removeVertex("bob");
        printGraph();

    }

    static void addVertex(String vertex) {
        adjMap.putIfAbsent(vertex,new ArrayList());
    }

    static void addEdge(String v1, String v2) {
        adjMap.get(v1).add(v2);
        adjMap.get(v2).add(v1);
    }

    static void removeVertex(String v) {
        adjMap.values().stream().forEach(e -> e.remove(v));
        adjMap.remove(v);
    }


    static void printGraph() {
        System.out.println("******* Graph ***********");
        for(Map.Entry<String,ArrayList<String>> entry: adjMap.entrySet()) {
            System.out.print(entry.getKey()+" ---> ");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }
}

