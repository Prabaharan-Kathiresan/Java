public class RectangleAdapter {
    Rectangle rectangle = new Rectangle();
    public void draw(int x1, int y1, int x2, int y2) {
        int width = x2-x1;
        int height = y2-y1;

        rectangle.draw(x1,y1,width,height);

    }
}