import java.util.*;
public class Program3 {
    public static void main(String args[]) {
        HashSet<Integer> hs= new HashSet();
        //add elements
        hs.add(1);hs.add(5);hs.add(2);hs.add(4);hs.add(6);hs.add(3);hs.add(123);
        System.out.println(hs);

        //accessing elements
        for(Integer num:hs) {
            System.out.print(num + " ");
        }
        System.out.println();
        //removing
        hs.remove(5);
        System.out.println(hs);

        //union
        HashSet<Integer> hs1= new HashSet();
        hs1.add(21);hs1.add(25);
        HashSet<Integer> hs2=new HashSet();
        hs2.addAll(hs);hs2.addAll(hs1);
        System.out.println(hs2);

        //intersection
        hs2.retainAll(hs1);
        System.out.println(hs2);

        //containsAll
        HashSet<Integer> hs3= new HashSet();
        hs3.addAll(hs);hs3.addAll(hs1);
        System.out.println("hs3 containsAll hs2?="+hs3.containsAll(hs2));

        //removeAll
        hs3.removeAll(hs2);
        System.out.println(hs3);
     }
}