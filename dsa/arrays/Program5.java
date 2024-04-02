public class Program5 {
    public static void main(String args[]) {
        int[] a1 =  {5,4,-1,7,8};
        largestSum(a1);
        largestProduct(a1);
    }

    static void largestSum(int[] a1) {
        int prevSum=Integer.MIN_VALUE,i=0,currSum=0;
        while(i<a1.length) {
            currSum += a1[i];
            if(prevSum<currSum) {
                prevSum = currSum;
            }
            if(currSum<0) {
                currSum=0;
            }
            i++;
        }
        System.out.println("Largest sum="+prevSum);
    }

    static void largestProduct(int[] a1) {
        int prevProduct=Integer.MIN_VALUE,i=0,currProduct=1;
        while(i<a1.length) {
            currProduct *= a1[i];
            if(prevProduct<currProduct) {
                prevProduct = currProduct;
            }
            if(currProduct<0) {
                currProduct=1;
            }
            i++;
        }
        System.out.println("Largest product="+prevProduct);
    }
}