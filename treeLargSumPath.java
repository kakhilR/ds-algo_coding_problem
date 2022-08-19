import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data=data;
        left = right = null;
    }
}


public class treeLargSumPath {
    Node root;
    
    int printMaxSumPath(Node node, int res){
        if(node == null) return 0;
        
        int l = printMaxSumPath(node.left, res);
        int r = printMaxSumPath(node.right, res);
        
        // this follows single path
        int maxSingle = Math.max(Math.max(l,r)+node.data, node.data);
        
        // this follows current node or sub tree
        int maxtop = Math.max(maxSingle, l+r+node.data);
    
        // store 
        res = Math.max(res, maxtop);
        
        return maxSingle;
    }
    
    void sum(){
        findmaxSum(root);
    }
    
    void findmaxSum(Node node){
        
        int res = Integer.MIN_VALUE;
        
        System.out.println(printMaxSumPath(node,res));
    }
    
	public static void main(String[] args) {
		treeLargSumPath tree = new treeLargSumPath();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        tree.sum();
	}
}

// https://www.onlinegdb.com/edit/D8c7Hg1z1
