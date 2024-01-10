/**
 * sort the numbers/ seggregate 0's and 1's/sort the colors
 * approach1 - 2 pointers technique used
 * approach2 - Dutch National flag algorithm
 * when more than 3 colors/numbers used use any sorting technique. 
 */
public class Program4 {
    public static void main(String args[]) { 
        int a[] = {0,2,0,1,0};
        approach2(a);
        printArray(a);
    }

    /**
     * two pointers technique used
     */
    public static void approach1(int[] a) {
        int left = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] == 0) {
                swap(a,left,i);
                left++;
            }
        }

        for(int i = left;i<a.length;i++) {
            if(a[i] == 1) {
                swap(a,left, i);
                left++;
            }
        }
    }
    public static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    /**
     * Dutch national flag algorithm
     * step1- Initialize 3 pointers p0-start/zero pointer, p2-end of the array/two pointer, curr- cursor position in the array
     * step2- iterate array through curr
     * step3- if element is zero swap the element and increase the p0
     *      - if element is two swap the element and decrease the p2
     *      - if elements is one dont swap increament the curr
     * step4 - do step3 until curr <=p2
     * 
     */
    public static void approach2(int[] a) {
        int p0=0,p2=a.length-1,curr=0;
        while(curr<=p2) {

            if(a[curr]==0) {
                swap(a,p0,curr);
                p0++;
                curr++;
            }
            else if(a[curr] == 2) {
                swap(a,p2,curr);
                p2--;
                
            } else if(a[curr] == 1) {
                curr++;
            }
           
            printArray(a);
        }

    }

    public static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}