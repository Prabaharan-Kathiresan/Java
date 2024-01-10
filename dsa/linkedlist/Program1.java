import java.util.*;
public class Program1 {
    public static void main(String args[]) {
        Node root = new Node(10);
        addNode(root,20);
        addNode(root,50);
        addNode(root,30);    
        printNode(root);
        deleteNode(root,3);
        printNode(root);
        root  = reverseLinkedList1(root);
        printNode(root);
    }    

    /**
     * print all node data
     */
    static void printNode(Node root) {
        System.out.println("******** Print Linked List ****************");
        Node node = root;
        do {
            System.out.print(node.data+" ");
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

    /**
     * delete the nth node from root
     */
    static void deleteNode(Node header, int n) {
        Node nNode = header;
        Node parent = header;
        int counter = 1;
        while(nNode!=null) { 
            if(counter == n) {
                parent.next = nNode.next;
                break;
            }
            parent = nNode;
            nNode = nNode.next;
            counter++;
        }
    }



    static void reverseLinkedList2(Node root) {

    }
}


