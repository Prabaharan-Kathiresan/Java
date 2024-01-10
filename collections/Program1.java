import java.util.*;
public class Program1 {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList();
        //add operation
        arrayList.add(4); // index = 0
        arrayList.add(7); // index = 1
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(1);
        System.out.println("Items="+arrayList);
        //access element
        System.out.println("Item in Index 1="+arrayList.get(1)); //2
        //remove element
        arrayList.remove(2);
        System.out.println("after removing index 2="+arrayList);

        //accessing elements in arrayList
        System.out.println("Simple for loop");
        for(int i =0;i<arrayList.size();i++) {
            System.out.print(arrayList.get(i)+ " ");
        }

        //enhanced for loop
        System.out.println();
        System.out.println("Enhanced for loop");
        for(Integer num:arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
        //sorting
        
        Collections.sort(arrayList); 
        System.out.println(arrayList);
        //sorting reverse
        
        Collections.sort(arrayList,Collections.reverseOrder()); 
        System.out.println(arrayList);
        //contains
        System.out.println("arrayList contains 1?="+arrayList.contains(1));
        
        ArrayList<Integer> al2 = new ArrayList();
        al2.add(7);al2.add(1);
        ArrayList<Integer> al3 = new ArrayList();
        //union
        al3.addAll(al2);al3.addAll(arrayList);
        System.out.println("arrayList3="+al3);

        //subset
        System.out.println("arrayList3 contains all arrayList2 elements?="+al3.containsAll(al2));

        //intersection
        al3.retainAll(al2);
        System.out.println(al3);

        //removeAll
        ArrayList<Integer> al4= new ArrayList();
        al4.add(7);al4.add(1);al4.add(4);
        arrayList.removeAll(al4);
        System.out.println("remove all elements from al1="+arrayList);    
        



    }
}