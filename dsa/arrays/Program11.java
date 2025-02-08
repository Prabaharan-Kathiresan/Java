public class Program11 {
    public static void main(String args[]) {
        int[] nums= {3,4,5,1,2};
        int ans=0;
        boolean flag = true;
        if(nums[0] < nums[nums.length-1]) {
            ans++;
        }
        for(int i=1;i<nums.length-1;i++) {
            if(nums[i-1] > nums[i] ) {
                ans++;
                if(ans>1) {
                    flag = false;
                    break;
                }
            }

        }
        System.out.println("sorted and rotated="+flag) ;
    }
}