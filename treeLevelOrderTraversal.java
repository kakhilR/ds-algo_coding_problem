import java.util.*;

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


public class treeLevelOrderTraversal {
    Node root;

    void printLevelOrder(){
        Queue<Node> q = new LinkedList<Node>();
        if(root == null) return;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.println(temp.data+" ");

            if(temp.left != null){
                q.add(temp.left);
            }
            
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }

    static void main(String[] args){
    treeLevelOrderTraversal tree = new treeLevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printLevelOrder();
    }
}

// executable code link
// https://www.onlinegdb.com/edit/KR_8HB7Aw