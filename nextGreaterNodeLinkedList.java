import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next = null;
    }
}


public class nextGreaterNodeLinkedList {
    Node head;
    void NGE(){
        Stack<Node> stack = new Stack<Node>();
        stack.push(head);
        Node temp = head;
        while(temp.next!=null){
            Node st = stack.peek();
            temp = temp.next;
            // System.out.println(temp.data+"temp");
            while(st.data<temp.data && stack.isEmpty()==false ){
                if(temp!=null){
                    stack.pop();
                    System.out.println(st.data+"->"+temp.data);
                    st = stack.peek();
                }
                // break;
            }
            stack.push(temp);
        }
    }
    
    
	public static void main(String[] args) {
		nextGreaterNodeLinkedList ll = new nextGreaterNodeLinkedList();
		ll.head = new Node(7);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(4);
		ll.head.next.next.next = new Node(1);
		ll.head.next.next.next.next = new Node(9);
		ll.NGE();
	}
}
// https://www.onlinegdb.com/edit/6wGmiYBf4