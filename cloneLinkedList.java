class Node{
    int data;
    Node next;
    Node random;
    
    Node(int data){
        this.data=data;
        this.next = null;
        this.random = null;
    }
}

public class cloneLinkedList {
    Node head;
    
    Node cloneList(){
        Node curr = head;
        Node temp;
        while(curr!=null){
            temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while(curr!=null){
            if(curr.next !=null){
                curr.next.random = (curr.random != null) ? curr.random.next : null;
                curr = curr.next.next;
            }
      }
        return curr;
    }
    
    Node separateList(Node node){
        Node original = node;
        Node clone = node.next;
        Node clone_head = clone;
        while(original!=null){
            original.next = original.next.next;
            clone.next = (clone.next!=null) ? clone.next.next : clone.next;
            original = original.next;
            clone = clone.next;
        }
        return clone_head;
    }
    
    void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
	public static void main(String[] args) {
		cloneLinkedList ll = new cloneLinkedList();
	    ll.head = new Node(10);
	    ll.head.next = new Node(20);
	    ll.head.next.next = new Node(30);
	    ll.head.next.next.next = new Node(40);
	    ll.head.next.next.next.next = new Node(50);
	    ll.head.next.next.next.next.next = new Node(60);
	    ll.head.next.next.next.next.next.next = new Node(70);
	    
	    ll.head.random =ll.head.next.next;
	    ll.head.next.random = ll.head;
	    ll.head.next.next.random = ll.head.next.next.next.next;
	    ll.head.next.next.next.random = ll.head.next.next.next.next;
	    Node t = ll.cloneList();
	    ll.printList(t);
	   // Node c = ll.separateList(t);
	   // ll.printList(c);
	   
	}
}

// https://www.onlinegdb.com/edit/qXUcj6opl