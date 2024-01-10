import java.io.*;
public class User1 {
    public static void main(String[] args) throws IOException {
        CeilingFan fan = new CeilingFan();
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("press enter to change the spin and c to stop");
        while(true) {
            if(dis.readLine().equalsIgnoreCase("c")) {
                break;
            }
            fan.pull();
        }

    }
}