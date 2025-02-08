public class Program10 {
    public static void main(String args[]) {
        int[] input = {4,5,6,7,0,1,2};
        int left =0, right = input.length-1;
        while( left < right ) {
            int mid = (right+left)/2;
            if(input[mid] < input[right]) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        System.out.println("Smallest element is "+input[left]);

        
    }
}