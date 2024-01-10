/**
 * bob=0,alice=1,maria=2,rob=3,mark=4
 */
public class Program2 {
    public static boolean[][] matrix= new boolean[5][5];

    public static void main(String arg[]) {
        addEdge(0,1);
        addEdge(0,3);
        addEdge(1,2);
        addEdge(1,4);
        addEdge(2,3);
        addEdge(4,3);
        printGraph();
    }

    static void addEdge(int v1,int v2) {
        matrix[v1][v2] = true;
        matrix[v2][v1] = true;
    }

    static void printGraph() {
        System.out.println("******* Graph ***********");
        
        for(int i=0;i<matrix.length;i++) {
            System.out.print(" "+i+" ");
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}