public class detectAndRemoveLoop {
    static Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    void findAndBreakLoop(Node head){
        Node slow = head;
        Node fast = head;
        
        slow = slow.next;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            if(slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == fast){
            slow = head;
            if(fast!=slow){
                while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
            }
            // else{
                
            // }
        }
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
	    detectAndRemoveLoop ll = new detectAndRemoveLoop();
	    ll.head = new Node(10);
	    ll.head.next = new Node(20);
	    ll.head.next.next = new Node(30);
	    ll.head.next.next.next = new Node(40);
	    ll.head.next.next.next.next = new Node(50);
	    head.next.next.next.next.next = head.next.next;
		ll.findAndBreakLoop(head);
		ll.printList(head);
		System.out.println("Hello World");
	}
}
