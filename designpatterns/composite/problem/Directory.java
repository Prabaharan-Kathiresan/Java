import java.io.*;
import java.util.*;
public class Directory {
    public String name;

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        childs.add(obj);
    } 

    ArrayList<Object> childs = new ArrayList();

    public void display() {
        for(Object obj:childs) {            
            if(obj instanceof Directory) {
                ((Directory) obj).display();
            } else {
                ((File) obj).display();
            }
        }
    }
}