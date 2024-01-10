import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList();
        al1.add(10);al1.add(25);al1.add(33);al1.add(33);
        System.out.println("sum of all numbers="+exercise2(al1));
        System.out.println("frequence of the element="+exercise1(al1,33));
        System.out.println("remove the duplicates="+exercise3(al1));
    }

    static int exercise1(ArrayList<Integer> al,Integer find) {
        int noOftimes = 0;
        for(Integer num:al) {
            if(num==find) {
                noOftimes++;
            }
        }
        return noOftimes;
    }

    static int exercise2(ArrayList<Integer> al) {
        int total = 0;
        for(Integer num:al) {
            total = total+num;
        }
        return total;
    }
    
    static ArrayList<Integer> exercise3(ArrayList<Integer> al) {
        HashSet<Integer> hs = new HashSet(al);
        return new ArrayList(hs);
    }
}