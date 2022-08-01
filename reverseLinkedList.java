// 10->20->30->40->50->null
// prev = null curr = head r = curr.next
// curr.next = prev(null<-10) | prev =curr (prev = 10) | curr = r.next (curr = 20) |r=curr.next (r=30)
// will breap the loop when curr.next = null;

public class reverseLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node r = null;
        r = curr.next;
        while(curr.next != null){
           curr.next = prev;
           prev = curr;
           curr = r;
           r = curr.next;
        }
        curr.next = prev;
        head = curr;
        return head;
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
        reverseLinkedList ll = new reverseLinkedList();
	    ll.head = new Node(10);
	    ll.head.next = new Node(20);
	    ll.head.next.next = new Node(30);
	    ll.head.next.next.next = new Node(40);
	    ll.head.next.next.next.next = new Node(50);
	    head = ll.reverseList(head);
		ll.printList(head);
	}
}

// executable code
// https://www.onlinegdb.com/edit/l4iYINbxT