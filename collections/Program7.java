import java.util.*;
public class Program7 {
    public static void main(String args[]) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"A");hm.put(2,"B");hm.put(3,"C");hm.put(11,"AA");
        System.out.println(hm);
        System.out.println("Get elements="+hm.get(1));
        hm.replace(2,"BB");
        for(Map.Entry<Integer,String> elements:hm.entrySet()) {
            System.out.print(elements.getKey()+" ");
            System.out.println(elements.getValue()+" ");
        }
        System.out.println("Keys="+hm.keySet());
        System.out.println("Values="+hm.values());
        System.out.println("contains key="+hm.containsKey(1));
        hm.remove(1);
        System.out.println("after removing 1="+hm);

        //linkedHashmap
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap();
        lhm.put(21,"A");lhm.put(22,"B");lhm.put(23,"C");lhm.put(31,"AA");
        System.out.println(lhm);
        System.out.println("Get elements="+lhm.get(21));
        for(Map.Entry<Integer,String> elements:lhm.entrySet()) {
            System.out.print(elements.getKey()+" ");
            System.out.println(elements.getValue()+" ");
        }
        lhm.replace(22,"AA");
        System.out.println("Keys="+lhm.keySet());
        System.out.println("Values="+lhm.values());
        System.out.println("contains key="+lhm.containsKey(21));
        lhm.remove(21);
        System.out.println("after removing 21="+lhm);
        
        //TreeMap
        TreeMap<Integer,String> tm = new TreeMap();
        tm.put(31,"A");
        tm.put(32,"B");
        tm.put(35,"C");
        System.out.println(tm);
        System.out.println("Get elements="+tm.get(31));
        for(Map.Entry<Integer,String> elements:tm.entrySet()) {
            System.out.print("key="+elements.getKey());
            System.out.println("value="+elements.getValue());
        }
        tm.replace(32,"AA");
        System.out.println("Keys="+tm.keySet());
        System.out.println("Values="+tm.values());
        System.out.println("contains key="+tm.containsKey(31));
        lhm.remove(31);
        System.out.println("after removing 31="+tm);
        Map.Entry<Integer,String> ceilingEntry= tm.ceilingEntry(33);
        System.out.println("ceiling entry="+ceilingEntry.getKey());
        Map.Entry<Integer,String> floorEntry= tm.floorEntry(33);
        System.out.println("floor entry="+floorEntry.getKey());

    }
}