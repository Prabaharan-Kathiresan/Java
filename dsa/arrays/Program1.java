/**
 * input = [10,20,35,50,75,80]
 * Find the pair of elements which is sum of 70
 * algorithm used - 2 pointers technique
 * time complexity - O(n)
 * works only with sorted arrays
 */
public class Program1 {
    public static void main(String args[]) {
        int[] input = {10,20,35,50,75,80};
        int left = 0, right  = input.length -1;
        int x =70;
        while(left < right) {
            int sum  = input[left] + input[right];
            if(sum == x) {
                break;
            }
            if(sum < x) {
                left++;
            } else {
                right--;
            }            
        }
        System.out.println("Matching pair is "+input[left]+ " "+ input[right]);
    }
}