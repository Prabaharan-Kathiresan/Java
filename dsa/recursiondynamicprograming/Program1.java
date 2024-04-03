public class Program1 {
    public static void main(String args[]) {
        int stairs = 5;
        System.out.println(climbStairs(stairs));
    }

    static int climbStairs(int n) {
        if(n==0||n==1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}