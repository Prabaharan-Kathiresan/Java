import java.io.*;
import java.util.*;
public class Directory implements AbstractFile {
    public String name;

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractFile obj) {
        childs.add(obj);
    } 

    ArrayList<AbstractFile> childs = new ArrayList();

    public void display() {
        for(AbstractFile file:childs) {            
            file.display();
        }
    }
}