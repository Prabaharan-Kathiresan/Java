import java.io.*;
/**
 * Find the Kth largest/smallest element in an array
 * approach1- brute force approach
 * approach2- quick select algorithm
 * approach3- use any sorting 
 */
public class Program5 {
    public static void main(String args[]) throws IOException {
        //int a[]= {1,5,3,7,9};
        int a[] = {3,2,1,5,8,4};
        //approach1(a);
        approach2(a,2);        
    }

    /**
     * find the largest/smallest element in an array
     * time complexity - O(n)
     */
    public static void approach1(int[] a) {
        int largest=a[0],smallest=a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i]>largest)
            {
            largest=a[i];
            }
            if(a[i]<smallest)
            {
            smallest=a[i];
            }
        }
        System.out.println("largest="+largest);
        System.out.println("smallest="+smallest);
    }
    
    /**
     * quick select algorithm used
     */
    public static void approach2(int[] a, int k) {
        int kthLargest = a[quickSelect(a,0,a.length-1,a.length-k)];
        System.out.println("Kth Largest Element "+kthLargest);
    }

    public static int quickSelect(int[] nums,int low,int high,int k) {
        int idx = partition(nums,low,high);
        if(idx == k) {
            return k;
        } else if(idx > k) {
            return quickSelect(nums,low,idx-1,k);
        } else {
            return quickSelect(nums,idx+1,high,k);
        }

    }

    public static int partition(int[] nums,int low, int high) {
        int pivot = nums[high];
        int j = low;
        for(int i=low;i<high;i++) {
            if(nums[i] < pivot) {
                swap(nums,i,j);
                j++;
            }
        }
        swap(nums,high,j);
        printArray(nums);
        return j;
    }

    public static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
