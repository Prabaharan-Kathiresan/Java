import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        int[] a1 = {1,2,4,5}; //3 is missing
        int[] a2 = {1,3,4,5,2,2}; //3 is duplicate
        //approach1(a1,a2,5);
         approach2(a1,a2,5);
    }

    static void approach1(int[] a1,int[] a2,int n) {
        int sum = (n * (n+1))/2;
        int sum1 = 0;
        for(int i=0;i<a1.length;i++) {
            sum1 += a1[i];
        }
        System.out.println("missing number="+(sum-sum1));
              
        int sum2 = 0;
        for(int i=0;i<a2.length;i++) {
            sum2 += a2[i];
        }      
        System.out.println("duplicate number="+(sum-sum2));
    }
    
    static void approach2(int[] a1,int[] a2,int n) {
        boolean[] duplicateArray = new boolean[a2.length+1];
        int duplicate=-1;
        for(int i=0;i<=a2.length;i++) {
            if(duplicateArray[a2[i]]) {
                duplicate=i;
                break;
            }
            duplicateArray[a2[i]] = true;
            
        }
        System.out.println("duplicate number="+a2[duplicate]);
   
    }
}