
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class treeIsBST {
    Node root;
    
    boolean checkIsBST(Node node, int minVal, int maxVal){
        
        if(node == null) return true;
        
        if(node.data<minVal || node.data>maxVal){
            return false;
        }
        
        return (checkIsBST(node.left,minVal,node.data) && checkIsBST(node.right, node.data+1, maxVal));
    }
    
    void isBST(){
        
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        
        System.out.println(checkIsBST(root,minVal,maxVal));
    }
	public static void main(String[] args) {
		treeIsBST tree = new treeIsBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.isBST();
    }
}

// https://www.onlinegdb.com/edit/eJhWOfYGE