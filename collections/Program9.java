import java.util.*;
public class Program9 {
    public static void main(String[] args) {
        ArrayDeque arrDeque = new ArrayDeque();
        //stack
        arrDeque.push(3);
        arrDeque.push(6);
        arrDeque.push(4);
        arrDeque.push(5);
        arrDeque.push(1);
        System.out.println(arrDeque);
        while(arrDeque.peek()!=null) {
            System.out.print(arrDeque.pop()+" ");
        }
        System.out.println("Elements in arrDeque="+arrDeque);        
        //queue
        arrDeque.offer(3);
        arrDeque.offer(6);
        arrDeque.offer(4);
        arrDeque.offer(5);
        arrDeque.offer(1);
        System.out.println(arrDeque);
        while(arrDeque.peek()!=null) {
            System.out.print(arrDeque.poll()+" ");
        }
        //deque
        arrDeque.offerFirst(3); //[3]
        arrDeque.offerLast(6); //[3,6]
        arrDeque.offerFirst(4); //[4,3,6]
        arrDeque.offerLast(5);  //[4,3,6,5]
        arrDeque.offerFirst(1);  //[1,4,3,6,5]
        arrDeque.offerLast(7);  //[1,4,3,6,5,7]
        System.out.println(arrDeque);
        while(arrDeque.peekFirst()!=null || arrDeque.peekLast()!=null){ 
            System.out.print(arrDeque.pollFirst()+ " ");
            System.out.print(arrDeque.pollLast()+ " ");
        }
                
    }
}