public class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        Person p = (Person) obj;
        if(this.name.equalsIgnoreCase(p.name) && this.age == p.age) {
            return true;
        }
        return false;
    }


    public int compareTo(Person person) {
        return this.name.compareTo(person.name);      
    }

    
    public String toString() {
        return this.name+" "+this.age;
    }

    public int hashCode(){
        return this.name.hashCode();
    }
}