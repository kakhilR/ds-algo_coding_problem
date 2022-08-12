class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class heightOfTree {
    Node root;
    
    int height_tree(Node node){
       if(node == null) return -1;
       int lt, rt;
       lt = height_tree(node.left);
       rt = height_tree(node.right);
       
       return Math.max(lt,rt)+1;
        
    }
    
    void treeHeight(){
        tree_height(root);
    }
    void tree_height(Node node){
        
        System.out.println(height_tree(node));
    }

    public static void main(String[] args) {
	    heightOfTree tree= new heightOfTree();
	    tree.root = new Node(1);
	    tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
	    tree.root.right.left = new Node(6);
	    tree.root.right.right= new Node(7);
	    tree.root.right.left.left = new Node(8);
	    
	    tree.treeHeight();
	}
}

// https://www.onlinegdb.com/edit/WCLmnX2TX