public class Program9 {
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
        //rotate(nums,2);
        approach2(nums,7);

    }

    public static void approach2(int[] nums,int k) {
        int high = nums.length;
        for(int i=0;i<k;i++) {            
            for(int j=high-1;j>0;j--) {                      
                swap(nums,j,j-1);
            }
        }
        printArray(nums);
    }

    public static void swap(int[] a, int left, int right) {
        
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }


}