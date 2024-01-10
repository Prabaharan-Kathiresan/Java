import java.io.*;
public class User {
    public static void main(String args[]) throws IOException {
        Line line = new Line();
        line.draw(1,1,4,1);

        RectangleAdapter adapter = new RectangleAdapter();
        adapter.draw(1,1,2,2);

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader in = new InputStreamReader(System.in);
        System.out.println((char)in.read());
        
    }
}