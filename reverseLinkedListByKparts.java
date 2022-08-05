public class reverseLinkedListByKparts {
    static Node head;
    
    static class Node{
        int data; 
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    boolean isReversePossibl(int k,Node curr){
        // Node temp = head;
        for(int i=0;i<k;i++){
            if(curr == null) return false;
            curr = curr.next;
        }
        return true;
    }
    
    Node reverse(Node prev,Node curr, int k){
        for(int i=0;i<k-1;i++){
            Node temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            // System.out.print(prev.data+"prev");
        }
        return curr;
    }
    
    Node reverseListBykPart(Node head,int k){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy; 
        Node curr = head;
        while(curr != null){
            boolean possible = isReversePossibl(k,curr);
                System.out.println(curr.data+"->");
            if(possible){
                System.out.println("in if");
                prev = reverse(prev,curr,k);
                curr = prev.next;
            }
            else{
                break;
            }
        }
        return dummy.next;
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
	    reverseLinkedListByKparts ll = new reverseLinkedListByKparts();
	    ll.head = new Node(10);
	    ll.head.next = new Node(20);
	    ll.head.next.next = new Node(30);
	    ll.head.next.next.next = new Node(40);
	    ll.head.next.next.next.next = new Node(50);
	    ll.head.next.next.next.next.next = new Node(60);
	    ll.head.next.next.next.next.next.next = new Node(70);
	    int k = 3;
	    ll.reverseListBykPart(head,k);
	   // ll.printList(head);
	}
}

// executable code
// https://www.onlinegdb.com/edit/IKQhZfqLo