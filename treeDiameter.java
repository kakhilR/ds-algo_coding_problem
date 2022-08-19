import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

class Height{
    int h;
}

public class treeDiameter {
    Node root;
    
    int diameter_tree(Node root, Height ht){
        Height lh = new Height();
        Height rh = new Height();
        int ld=0;
        int rd = 0;
        if(root == null){
            ht.h = 0;
            return 0;
        }
        ld = diameter_tree(root.left,lh);
        rd = diameter_tree(root.right,rh);
        ht.h = Math.max(lh.h,rh.h)+1;
        return Math.max(lh.h + rh.h +1, Math.max(ld,rd));
    }
    
    void tree_diameter(){
        Height height = new Height();
        diameter_tree(root,height);
    }
	public static void main(String[] args) {
	    treeDiameter tree = new treeDiameter();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.tree_diameter();
	}
}

// https://www.onlinegdb.com/edit/SZFWUcU3T