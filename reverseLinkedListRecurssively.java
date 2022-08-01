public class reverseLinkedListRecurssively {
    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    Node reverseLinkedList(Node head){
        if (head==null) return head;
        if(head.next == null) return head;
        Node newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
	    reverseLinkedListRecurssively ll = new reverseLinkedListRecurssively();
	    ll.head = new Node(10);
	    ll.head.next = new Node(20);
	    ll.head.next.next = new Node(30);
	    ll.head.next.next.next = new Node(40);
	    ll.head.next.next.next.next = new Node(50);
	    head = ll.reverseLinkedList(head);
		ll.printList(head);
	}
}


// executable code link
// https://www.onlinegdb.com/edit/UuJb3AFdP