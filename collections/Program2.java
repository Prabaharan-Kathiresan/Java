import java.util.*;
public class Program2 {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList();
        //add operation
        linkedList.add(4); // index = 0
        linkedList.add(7); // index = 1
        linkedList.add(6);
        linkedList.add(9);
        linkedList.add(1);
        System.out.println("Items="+linkedList);
        //access element
        System.out.println("Item in Index 1="+linkedList.get(1)); //2
        //remove element
        linkedList.remove(2);
        System.out.println("after removing index 2="+linkedList);

        //accessing elements in LinkedList
        System.out.println("Simple for loop");
        for(int i =0;i<linkedList.size();i++) {
            System.out.print(linkedList.get(i)+ " ");
        }

        //enhanced for loop
        System.out.println();
        System.out.println("Enhanced for loop");
        for(Integer num:linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
        //sorting operation
        System.out.println("Sorting in ascending");
        Collections.sort(linkedList); //ascending 
        System.out.println(linkedList);
        //sorting in reverse
        System.out.println("reverse sorting");
        Collections.sort(linkedList,Collections.reverseOrder()); 
        System.out.println(linkedList);
        //contains
        System.out.println("LinkedList contains 1?="+linkedList.contains(1));

        LinkedList<Integer> ll2 = new LinkedList();
        ll2.add(7);ll2.add(1);
        LinkedList<Integer> ll3 = new LinkedList();
        //union
        ll3.addAll(ll2);ll3.addAll(linkedList);
        System.out.println("LinkedList3="+ll3);

        //subset
        System.out.println("LinkedList3 contains all LinkedList2 elements?="+ll3.containsAll(ll2));

        //intersection
        ll3.retainAll(ll2);
        System.out.println(ll3);

        //removeAll
        LinkedList<Integer> ll4= new LinkedList();
        ll4.add(7);ll4.add(1);ll4.add(4);
        linkedList.removeAll(ll4);
        System.out.println("remove all elements from ll1="+linkedList);    

    }
}