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

public class treeDeserialize {
    Node root;
    
    List<Integer> serialize(){
        Queue<Node> q= new LinkedList<Node>();
        List<Integer> list = new ArrayList<Integer>();
        int min_value = Integer.MIN_VALUE;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.data == min_value){
                list.add(min_value);
            }
            else{
                list.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return list;
    }
    
    void deSerialize(int[] arr, start, end){
        int mid = start+end/2;
        Node node = new Node(Arr[mid]);
        if(start!=end){
            node.left = deSerialize(arr, start, mid);
            node.right = deSerialize(arr, mid-1, end);
        }
    }
    public static void main(String[] args) {
	    treeDeserialize tree = new treeDeserialize();
		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
	}
}

// https://www.onlinegdb.com/edit/PN7kKTuEI