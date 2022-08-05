public class LinkedListPalindrome {
    static Node head;
    
    static class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    // Node findMiddleNode(Node head){
    //     Node fast = head.next;
    //     Node slow = head;
    //     String even = "false";
    //     String odd = "false";
    //     while(fast != null && fast.next != null){
    //         if(fast == null){
    //             even = "true";
    //         }
    //         if(fast.next == null){
    //             odd = "true";
    //         }
    //         slow = slow.next;
    //         fast = fast.next.next;

    //     }
    //     System.out.println(slow.data);
    //     return slow;
    // }
    
    Node reverse(Node slow){
        Node curr = slow;
        Node pre = null;
        Node temp = curr.next;
        while(curr.next != null){
           curr.next = pre;
           pre = curr;
           curr = temp;
           temp = curr.next;
        }
        curr.next = pre;
        return curr;
    }
    
    void ispalindrome(Node head){
        Node fast = head;
        Node slow = head;
        Node prev_slow = head;
        Node midPtr = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            
            prev_slow = slow;
            slow = slow.next;
        }
        if(fast != null){
            midPtr = slow;
            slow = slow.next;
        }
        Node secondhalf = slow;
        prev_slow.next = null;
        Node head2 = reverse(secondhalf);
        while((head != null) && (head2 != null)){
            if(head.data == head2.data){
                head = head.next;
                head2 = head2.next;
            }
            else{
                System.out.println("false");
                break;
            }
        }
        // return head;
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
	    LinkedListPalindrome ll = new LinkedListPalindrome();
	    ll.head = new Node("a");
	    ll.head.next = new Node("b");
	    ll.head.next.next = new Node("c");
	    ll.head.next.next.next = new Node("d");
	    ll.head.next.next.next.next = new Node("k");
	    ll.head.next.next.next.next.next = new Node("c");
	    ll.head.next.next.next.next.next.next = new Node("b");
	    ll.head.next.next.next.next.next.next.next = new Node("a");
	   // Node mid = ll.findMiddleNode(head);
	   //Node first = ll.ispalindrome(head);
	   //ll.printList(first);
	   ll.ispalindrome(head);
	}
}

// executable code link
// https://www.onlinegdb.com/edit/SJo9SDNp1