/**
 * find the intersection of 2 singly linked list
 * algorithm used - 2 pointers technique
 */
public class Program2 {
    public static void main(String args[]) {
        Node root = new Node(10);
        root  = addNode(root,20);
        Node node50=new Node(50);
        Node node30 = new Node(30);
        root.next = node50;
        root.next.next = node30;
        printNode(root);
        Node root1 = new Node(15);
        addNode(root1,25);
        root1.next = node50;
        root1.next.next=node30; 
        printNode(root1);
        Node nodeIntersected = intersectionNode(root,root1);
        System.out.println("Intersected node "+nodeIntersected.data);
    }    

    /**
     * print all node data
     */
    static void printNode(Node root) {
        Node node = root;
        do {
            System.out.print(node.data+" > ");
            node = node.next;
        } while(node!=null);
        System.out.println();
    }

    /**
     * add new node to the end of the header
     */
    static Node addNode(Node header, int data) {
        Node lastNode = header;
        while(lastNode.next!=null) {
            lastNode = lastNode.next;
        }
        Node nodeNew = new Node(data);
        lastNode.next = nodeNew;
        return header;
    }

    static Node intersectionNode(Node root1,Node root2) {
        Node p1 = root1;
        Node p2 = root2;
        while(p1!=p2) {
            if(p1==null) {
                p1=root2;
            } else {
                p1=p1.next;
            }
            if(p2==null) {
                p2=root1;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }    
    
}


