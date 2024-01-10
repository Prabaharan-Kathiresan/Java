import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue();
        //add elements 
        pq.add(5);pq.add(3);pq.add(2);
        pq.add(4);pq.add(1); //comes from collection interface
        pq.offer(9); //comes from queue
        pq.offer(7); //comes from queue
        System.out.println(pq); //will not quaranteed the ordering
        System.out.println(pq.contains(9));
        while(pq.peek()!=null) {
            if(pq.peek()==3) {
                pq.remove();
            }
            System.out.println(pq.poll()+ " "); // ordring quaranteed with peek and poll
        }
        
    }
}