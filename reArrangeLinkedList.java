class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next = null;
    }
}


public class reArrangeLinkedList {
    Node head;
    
    Node reverse(Node node){
        Node curr = node;
        Node prev = null;
        Node temp = curr.next;
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = curr.next;
        }
        curr.next = prev;
        return curr;
    }
    
    Node reArrangeList(){
        Node curr = head;
        Node slow = head;
        Node fast = head;
        Node mid_ptr = null; 
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            mid_ptr = slow;
            slow = slow.next;
        }
        if(fast!=null){
            mid_ptr = slow;
            slow = slow.next;
        }
        mid_ptr.next = null;
        Node rev = reverse(slow);
        
        while(curr!=null || rev!=null){
            
        }
        return curr;
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
		reArrangeLinkedList ll = new reArrangeLinkedList();
		ll.head = new Node(10);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(40);
		ll.head.next.next.next.next = new Node(50);
		ll.head.next.next.next.next.next = new Node(60);
		Node t = ll.reArrangeList();
		ll.printList(t);
		
	}
}

// https://www.onlinegdb.com/edit/RY_4VNHVoy