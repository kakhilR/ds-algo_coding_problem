import java.util.*;

class Node {
    Character data;
    Node left;
    Node right;
    
    Node(Character data){
        this.data = data;
        left =null;
        right =null;
    }
}

public class treeZigZag {
    Node root;
    
    void printTreeZigZag(){
        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();
        st2.push(root);
        // System.out.println(root.data);
        while(!st1.isEmpty() || !st2.isEmpty()){
            
            while(!st2.isEmpty() ){
                Node tempst2 = st2.pop();
                System.out.print(tempst2.data+" ");
                if(tempst2.left!=null){
                    st1.push(tempst2.left);
                }
                if(tempst2.right!=null){
                    st1.push(tempst2.right);
                }
            }
            while(!st1.isEmpty() ){
                Node tempst1 = st1.pop();
                System.out.print(tempst1.data+" "); 
                if(tempst1.left!=null){
                    st2.push(tempst1.right);
                }
                if(tempst1.right!=null){
                    st2.push(tempst1.left);
                }
            }
        }
    }
	public static void main(String[] args) {
	    treeZigZag tree= new treeZigZag();
	    tree.root = new Node('A');
	    tree.root.left = new Node('B');
	    tree.root.right = new Node('C');
	    tree.root.left.left = new Node('D');
	    tree.root.left.right = new Node('E');
	    tree.root.right.left = new Node('F');
	    tree.root.right.right= new Node('G');
		tree.printTreeZigZag();
	}
}


// https://www.onlinegdb.com/edit/meWhOlS8aI