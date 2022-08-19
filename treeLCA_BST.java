class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class treeLCA_BST {
    Node root;
    
    Node commonAncestor(Node node,int n1,int n2){
        if(node == null) return null;
        
        if(n1<node.data && n2<node.data){
            return commonAncestor(node.left,n1,n2);
        }
        if(n1>node.data && n2>node.data){
            return commonAncestor(node.right,n1,n2);
        }
        return node;
    }
    
    void printAncesstor(){
        Node result = commonAncestor(root,10,14);
        System.out.println(result.data);
    }
    
	public static void main(String[] args) {
		treeLCA_BST tree = new treeLCA_BST();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        tree.printAncesstor();
	}
}

// https://www.onlinegdb.com/edit/N63UhP7Km