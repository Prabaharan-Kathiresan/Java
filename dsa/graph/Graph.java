import java.util.*;
public class Graph {
    
    public int vertices;
    public ArrayList<ArrayList<Integer>> graph = new ArrayList();

    public ArrayList<ArrayList<Integer>> dgraph = new ArrayList();

    public Graph() {}
    public Graph(int vertices) {
        this.vertices = vertices;
        for(int i=0;i<vertices;i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<vertices;i++) {
            dgraph.add(new ArrayList<>());
        }
    }

    public void addEdge(int s, int v) {
        graph.get(s).add(v);
        graph.get(v).add(s);
    }

    public void addEdgeDGraph(int s, int v) {
        dgraph.get(s).add(v);
    }

    public void printGraph() {
        for(int i=0;i<vertices;i++) {
            System.out.println(i+"-->"+graph.get(i)+ " ");
        }
    }

    public void printDGraph() {
        for(int i=0;i<vertices;i++) {
            System.out.println(i+"-->"+dgraph.get(i)+ " ");
        }
    }

    public void BFS(int s) {
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList(); 
        visited[s] = true;
        queue.add(s);
            
        while(queue.size()!=0) {
            System.out.print(queue);
            int cursor = queue.poll();
            Iterator<Integer> i = graph.get(cursor).listIterator();    
            while(i.hasNext()) {
                int nextCursor = i.next();
                if(!visited[nextCursor]) {
                    visited[nextCursor] = true;
                    System.out.print("  visited="+nextCursor);
                    queue.add(nextCursor);
                }
            }
            System.out.println();
        }     
    }

    public void DFS(int s) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(s, visited);
    }

    public void DFSUtil(int s, boolean[] visited) {
        System.out.println("visited="+s);
        visited[s] = true;
        Iterator<Integer> i = graph.get(s).listIterator();
        while(i.hasNext()) {
            int num = i.next();
            if(!visited[num]) {
                DFSUtil(num,visited);
            }
        }
    }

    public void toplogicalSort() {
        Stack<Integer> stack = new Stack();
        boolean[] visited = new boolean[vertices];
        for(int i=0;i<vertices;i++) {
            if(!visited[i]) {
                toplogicalSortUtil(i,visited,stack);
            }
        }       
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    public void toplogicalSortUtil(int vertex,boolean[] visited,Stack<Integer> stack) {
        visited[vertex] = true;
        Iterator<Integer> listIterator = dgraph.get(vertex).listIterator();
        while(listIterator.hasNext()) {
            int num = listIterator.next();
            if(!visited[num]) {
                toplogicalSortUtil(num,visited,stack);
            }
        }
        stack.push(vertex);
    }
}