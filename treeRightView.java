import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Max_level{
    int Max_level;
}

public class treeRightView {
    Node root;
    
    // bfs approch
    void printRightViewTreeBFS(){
        Queue<Node> q= new LinkedList<Node>();
        if(root == null) return;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i =0;i<n;i++){
                Node temp = q.poll();
                
                if(i==n-1){
                    System.out.print(temp.data+" ");
                }
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
            
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            
        }
    }
    
    // dfs approch
    void printRightViewDFS(Node node, int level, Max_level max_level){
        if(node == null) return;
        
        if(max_level.max_level < level){
            System.out.println(node.data+" ");
            max_level = level;
        }
        
        printRightViewDFS(node.right,level+1,max_level);
        printRightViewDFS(node.left,level+1,max_level);
    }
    
    void treeRightViewDFS(Node node){
        printRightViewDFS(node,1,max);
    }
    
    void rightViewDFS(){
        treeRightViewDFS(root);
    }
    
	public static void main(String[] args) {
		treeRightView tree= new treeRightView();
	    tree.root = new Node(1);
	    tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
	    tree.root.right.left = new Node(6);
	    tree.root.right.right= new Node(7);
	    tree.root.left.left.left = new Node(10);
	    tree.root.left.right.right = new Node(8);
	   // tree.printRightViewTreeBFS();
	   tree.rightViewDFS();
	}
}

// https://www.onlinegdb.com/edit/4H364HZhW