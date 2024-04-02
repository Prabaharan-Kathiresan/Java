/**
 * Sort the array
 * approch1 - recursive strategy
 * approch2 - merge sort
 * exercise1 -  why a1[]  is not working with recursive strategy
 * exercise2 - merge 2 unsorted arrays into single sorted array
 */
public class Program4 {
    public static void main(String args[]) {
        int a1[] = {-74,48,-20,2,10,-84,-5,-9,11,-24,-91,2,-71,64,63,80,28,-30,-58,-11,-44,-87,-22,54,-74,-10,-55,-28,-46,29,10,50,-72,34,26,25,8,51,13,30,35,-8,50,65,-6,16,-2,21,-78,35,-13,14,23,-3,26,-90,86,25,-56,91,-13,92,-25,37,57,-20,-69,98,95,45,47,29,86,-28,73,-44,-46,65,-84,-96,-24,-12,72,-68,93,57,92,52,-45,-2,85,-63,56,55,12,-85,77,-39};
        int a[] = {1,3,2,4,5};
        int a2[] = {1,1,0,0,1,0,1};
        //approach1(a,0,a.length-1);
        approach2(a2);

        for(int i=0;i<a2.length;i++) {
            System.out.println(a2[i]);
        }
    }

    /** 
     * using recursive technique
     * Program works with a[] but dont for a1[]
     */
    public static int[] approach1(int[] a, int start, int end) {
        while(start < end) {
            if(a[start] <= a[end]) {
                approach1(a,0,start);
                start++;
                continue;
            }
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            approach1(a,0,end);
            start++;            
        }
        return a;
    }

    /**
     * using merge sort
     * time complexity - nlogn
     */
    public static void approach2(int[] inputArray) {
        int inputArrLength = inputArray.length;
        if(inputArrLength<2) {
            return ;
        }
        int midIndex = inputArrLength/2 ;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArrLength-midIndex];
        for(int i=0;i<midIndex;i++)  {
            leftHalf[i] = inputArray[i];
        }      

        for(int i=midIndex;i<inputArrLength;i++) {
            rightHalf[i-midIndex] = inputArray[i];
        }
        approach2(leftHalf);
        approach2(rightHalf);
        merge(inputArray,leftHalf, rightHalf);
    }

    public static void merge(int[] inputArray,int[] leftHalf, int[] rightHalf) {
        int i=0,j=0,k=0;
        while(i<leftHalf.length && j<rightHalf.length) {
            if(leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftHalf.length) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }       

        while(j<rightHalf.length) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}