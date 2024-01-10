import java.util.*;
public class Program3 {
    public static void main(String args[]) {
        Node root = new Node(10);
        root.next = new Node(20);
        root.next.next =  new Node(50);
        root.next.next.next = new Node(30);
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
     * using the stack
     */
    static Node reverseLinkedList1(Node head) {
        Stack<Node> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        
        Node result = stack.pop();
        Node temp = result;
        temp.print();
        while(!stack.empty()) {
            
            temp.next = stack.pop();
            temp = temp.next;
            
        }
        temp.next = null;
        
        return result;
    }

    

}


