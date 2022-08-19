class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


public class treePrintNodeKthDist {
    Node root;
    
    int printKdistanceNode(Node node, Node target, int k){
        if(node == null) return -1;
        if(node == target){
            printKDistChildrenNode(node, k);
            return 0;
        }
        int leftDist = printKdistanceNode(node.left, target, k);
        if(leftDist != -1){
            if(leftDist+1 == k){
                System.out.println(node.data);
            }else{
                printKDistChildrenNode(node.right, k-leftDist-2);
            }
            return 1+leftDist;
        }
        
        int rightDist = printKdistanceNode(node.right, target, k);
        if(rightDist != -1) {
            if(rightDist+1 == k){
                System.out.println(node.data);
            }else{
                printKDistChildrenNode(node.left, k-rightDist-2);
            }
            return 1+rightDist;
        }
        return -1;
    }
    
    void printKDistChildrenNode(Node node, int k){
        if(node == null){
            return;
        }
        if(k==0){
            System.out.println(node.data);
            return;
        }
        
        printKDistChildrenNode(node.left, k-1);
        
        printKDistChildrenNode(node.right, k-1);
        
    }
    
	public static void main(String[] args) {
	    treePrintNodeKthDist tree = new treePrintNodeKthDist();
		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        Node target = tree.root.left.right;
        tree.printKdistanceNode(tree.root, target, 2);
	}
}


// https://www.onlinegdb.com/edit/VIM10_rYj