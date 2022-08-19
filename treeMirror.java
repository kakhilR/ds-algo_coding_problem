class Node {
    int data;
    Node left;
    Node right;
    
    Node (int data){
        this.data= data;
        left=null;
        right=null;
    }
}

public class treeMirror {
    Node root;
    
    void mirror(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        mirror(root.left);
        mirror(root.right);
    }

    void printMirror(){
        mirror(root);
    }
    public static void main(String[] args) {
        treeMirror tree = new treeMirror();
		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        tree.printMirror();
	}
}

// https://www.onlinegdb.com/edit/2kx2sXSDq