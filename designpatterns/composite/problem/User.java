public class User {
    public static void main(String args[]) {
        File file1 = new File("Sivaji");
        File file2 = new File("Chandramuki");
        File file3 = new File("Dasavadaram");
        File file4= new File("vikram");
        File file5 = new File("Leo");
        File file6 = new File("maveeran");
        Directory dir1 = new Directory("Rajini");
        dir1.add(file1);
        dir1.add(file2);
        Directory dir2 = new Directory("Kamal");
        dir2.add(file3);
        dir2.add(file4);
        Directory dir3 = new Directory("movies");
        dir3.add(dir1);
        dir3.add(dir2);
        dir3.add(file5);
        dir3.add(file6);        
        dir3.display();


        
    
    }
}