import java.util.*;
public class Program4 {
    public static void main(String args[]) {
        TreeSet<Integer> ts = new TreeSet();
        TreeSet<Integer> ts1=new TreeSet();
        //add elements
        ts1.add(2);ts1.add(6);ts1.add(4);
        ts1.add(1);ts1.add(5);ts1.add(3);
        ts.addAll(ts1);
        System.out.println(ts1);
        //access elements
        for(int num:ts1) {
            System.out.print(num+" ");
        }
        //remove elements
        ts1.remove(5);
        System.out.println(ts1);
        //union
        TreeSet<Integer> ts2 = new TreeSet();
        ts2.addAll(ts1);
        //subset
        TreeSet<Integer> ts3 = new TreeSet();
        ts3.add(1);ts3.add(3);
        System.out.println("ts3 is subset of ts1?="+ts1.containsAll(ts3));
        //intersection
        ts1.retainAll(ts3);
        System.out.println(ts1);
        //removeAll
        TreeSet<Integer> ts4 = new TreeSet();
        ts4.add(1);
        ts1.removeAll(ts4);
        System.out.println(ts1);

        //headset
        System.out.println(ts.headSet(5,true));
        //tailSet
        System.out.println(ts.tailSet(5));
        //floor
        
        System.out.println(ts.floor(2));
        System.out.println(ts.floor(8));
        ts.add(10);
        System.out.println(ts.ceiling(8));
    }
}