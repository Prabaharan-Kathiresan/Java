/**
 * remove the duplicates from the array
 * algorithmm - 2 pointers technique
 * used only on the sorted array
 * 
 */
public class Program2 {
    public static void main(String args[]) {
        int a[] = {0,1,1,2,2,3,3,4,4,4}; 
        int uniqueLen = removeDuplicates(a);
        for(int k=0;k<uniqueLen;k++) {
            System.out.println(a[k]);
        }
    }

    public static int removeDuplicates(int[] arr) {       
        int lengt = arr.length;
        int i = 0;
        for(int j=1;j<arr.length;j++) {
            if(arr[i]!=arr[j]) {
                i++;
                arr[i] = arr[j];
            }            
        }
        return i;
    }
}