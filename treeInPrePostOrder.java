class Node{
    int key;
    Node left,right;
    
    Node(int data){
        key = data;
        left = right = null;
    }
}

public class treeInPrePostOrder {
    Node root;
    
    treeInPrePostOrder() { root = null; }  
    
    void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.key+" ");
        preOrder(node.left);
        preOrder(node.right);
    }   
    
    void postOrder(Node node){
        if( node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");
    }
    
    void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }
    
    void printPreOrder() {
        // preOrder(root);
        // postOrder(root);
        inOrder(root);
    }
	public static void main(String[] args) {
		treeInPrePostOrder tree = new treeInPrePostOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.printPreOrder();
	}
}
// executable code link
// https://www.onlinegdb.com/edit/mdAldHQed