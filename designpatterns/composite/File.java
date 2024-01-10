public class File implements AbstractFile {
    public String name;
    public File(String name) {
        this.name = name;
    }   
    public void display() {
        System.out.println("name of the movie "+name);
    }
}