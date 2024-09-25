public class RotateArray {
    public static void rotate(int[] nums,int k) {
        k%=nums.length;
        System.out.println("modulo="+k);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        printArray(nums);
    }

    public static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] nums = {1,2,3,4,5};
        rotate(nums,2);

    }


}