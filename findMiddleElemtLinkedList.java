public class findMiddleElemtLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    void findMiddleElemt(Node head){
        if(head == null) System.out.println("head is null");
        Node slowNode = head;
        Node fastNode = head;
        while((slowNode != null) && (fastNode.next != null)){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        System.out.println(slowNode.data);
    }
	public static void main(String[] args) {
	    findMiddleElemtLinkedList ll = new findMiddleElemtLinkedList();
	    ll.head = new Node(10);
	    ll.head.next = new Node(20);
	    ll.head.next.next = new Node(30);
	    ll.head.next.next.next = new Node(40);
	    ll.head.next.next.next.next = new Node(50);
		ll.findMiddleElemt(head);
	}
}

// executable conde link
// https://www.onlinegdb.com/edit/S8cPUigEF