public class Node {

    public int data;
    public Node next;

    public Node() { }

    public Node(int data) {
        this.data = data;
    }
    public void print() {
        System.out.println("data:"+this.data);
    }
}