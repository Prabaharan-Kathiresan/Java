import java.util.*;
/**
 *  basicMath=0,algebra=1,physics=2,calculus=3,OR=4
 * 
 */
public class Program6 {
   static ArrayList<ArrayList<Integer>> graph ;
   static int vertices;

   public static void main(String args[]) {
        int[][] prerequsites = {{1,0},{2,1},{4,3},{3,2},{}};
        vertices = 5;
        createGraph(5);
        int[] inDegree = addEdge(prerequsites);
        Queue<Integer> queue = new LinkedList();
        
        for(int i=0;i<vertices;i++) {
            if(inDegree[i]==0) {
                queue.offer(i);
            }
        }
        printInDegree(inDegree);
        int count=0;
        while(queue.size()>0) {
            int curr = queue.poll();
            count++;
            Iterator<Integer> i = graph.get(curr).listIterator();
            while(i.hasNext()) {
                int item = i.next();
                inDegree[item]--;
                if(inDegree[item] == 0) {
                    queue.offer(item);
                }
            }
        }
        System.out.println("count="+count);
   } 

    static void printInDegree(int[] inDegree) {
        for(int i=0;i<vertices;i++) {
            System.out.println(i+" --> "+inDegree[i]);
        }
    }

   static void createGraph(int vertices) {
        vertices = vertices;
        graph = new ArrayList(vertices);
        for(int i=0;i<vertices;i++) {
            graph.add(new ArrayList());
        }
   }

   static int[] addEdge(int[][] prerequsites) {
        int[] inDegree =  new int[vertices];
        for(int[] a: prerequsites) {
            int course = a[0];
            int preCourse = a[1];
            graph.get(preCourse).add(course);
            inDegree[course]++;
        }
        return inDegree;
   }
}