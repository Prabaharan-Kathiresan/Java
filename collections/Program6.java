import java.util.*;
public class Program6 {
    public static void main(String args[]) {
        Person person1 = new Person("A",21);
        Person person3 = new Person("B",25);
        Person person2 = new Person("C",23);
        Person person4 = new Person("A",21);        
        Person person5 = new Person("AA",27);
        System.out.println(person1.equals(person3));
        ArrayList<Person> persons = new ArrayList();
        persons.add(person1);persons.add(person2);persons.add(person3);
        persons.add(person4);persons.add(person5);
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);

        Collections.sort(persons,new AgeComparatorDescending());
        System.out.println("age comparator="+persons);

        //remove duplicates
        HashSet<Person> hs = new HashSet();
        hs.addAll(persons);
        System.out.println("remove duplicates="+hs);

        TreeSet<Person> ts = new TreeSet();
        ts.addAll(persons);
        System.out.println("TreeSet comparable="+ts);

        TreeSet<Person> ts1 = new TreeSet(new AgeComparatorDescending());
        ts1.addAll(persons);
        System.out.println("TreeSet comparator="+ts1);

    }
}


class AgeComparatorDescending implements Comparator<Person>{
    public int compare(Person p1,Person p2) {
        return p1.age-p2.age;       
    }
}