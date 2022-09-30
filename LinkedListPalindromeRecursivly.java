public class LinkedListPalindromeRecursivly {
    static Node head;
    
    static class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    boolean ispalindrome(Node temp){
        if(temp == null) {
            return true;
        };
        boolean res = ispalindrome(temp.next);
        if (res != true) return false;
        if (head.data != temp.data) return false;
        
        head = head.next;
        
        return res;
    }
    
	public static void main(String[] args) {
	    LinkedListPalindromeRecursivly ll = new LinkedListPalindromeRecursivly();
	    ll.head = new Node("a");
	    ll.head.next = new Node("b");
	    ll.head.next.next = new Node("c");
	    ll.head.next.next.next = new Node("d");
	    ll.head.next.next.next.next = new Node("i");
	    ll.head.next.next.next.next.next = new Node("b");
	    ll.head.next.next.next.next.next.next = new Node("a");
		System.out.println(ll.ispalindrome(head));
	}
}
// https://onlinegdb.com/yW3vhJ4Yn
