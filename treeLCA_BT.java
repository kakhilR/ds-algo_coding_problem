class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class treeLCA_BT {
    Node root;
    
    Node commonAncestorBT(Node node, int n1, int n2){
        if(node == null) return null;
        if(node.data == n1 || node.data ==n2) return node;
        
        Node leftFound = commonAncestorBT(node.left,n1,n2);
        Node rightFound = commonAncestorBT(node.right,n1,n2);
        
        if(leftFound != null && rightFound!=null){
            return node;
        }
        
        if(leftFound != null){
            return leftFound;
        }
        
        if(rightFound != null){
            return rightFound;
        }
        
        return null;
    }
    
      void printAncesstor(){
        Node result = commonAncestorBT(root,4,2);
        System.out.println(result.data);
    }
    
    
	public static void main(String[] args) {
		treeLCA_BT tree = new treeLCA_BT();
        tree.root = new Node(20);
        tree.root.left = new Node(7);
        tree.root.right = new Node(65);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(2);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        tree.printAncesstor();
	}
}

// https://www.onlinegdb.com/edit/Q5VagbWSD