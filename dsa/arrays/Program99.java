public class Program99 {
    public static void main(String args[]) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(a);
        printPrimaryDiagonal1(a);
        printPrimaryDiagonal2(a);
        printSecondaryDiagonal(a);
        printSecondaryDiagonal2(a);
        

    }
    static void printMatrix(int[][] a) {
        System.out.println("Print the Matrix");
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * time complexity - O(n2)
     */
    static void printSecondaryDiagonal(int[][] a) {
        System.out.println("print secondary diagonal - 2 loops");
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(i+j == a.length-1) {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    /**
    * time complexity - O(n)
    */
    static void printSecondaryDiagonal2(int[][] a) {
        System.out.println("print secondary diagonal - 1 loop");
        int k = a.length-1;
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i][k--]);
        }
    }

    /**
    * time complexity - O(n2)
    */
    static void printPrimaryDiagonal1(int[][] a) {
        System.out.println("print primary diagonal - 2 loops");
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(i==j) {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    /**
    * time complexity - O(n)
    */
    static void printPrimaryDiagonal2(int[][] a) {
        System.out.println("print primary diagonal - 1 loop");
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i][i]);
        }
    }
}
