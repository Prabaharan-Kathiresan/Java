public class User {
    public static void main(String args[]) {
        Line line = new Line();
        line.draw(1,1,4,1);

        // user expects to draw a rectangle of width 2, height 2
        Rectangle rectangle = new Rectangle();
        rectangle.draw(1,1,2,2); // starting point to ending point distance is x2-x1, y2-y1 so width 2-1 = 1, height is 1


        
    }
}