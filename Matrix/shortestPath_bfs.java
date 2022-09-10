package Matrix;
import java.util.*;

class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class queeNode{
    Point pt;
    int dist;
    
    queeNode(Point pt, int dist){
        this.pt = pt;
        this.dist = dist;
    }
}
public class shortestPath_bfs {
    boolean isSafe(int arr[][], int r, int c,){
        if((r<arr.length) && (r>=0) && (c<arr[0].length) && (c>=0)){
            return true;
        }
        return false;
    }
    
    int findShortestPath(int arr[][], Point src, Point dist){
        if(arr[src.x][src.y] != 1 || arr[dist.x][dist.y] != 1){
            return -1;
        }
        HashMap<Point,Boolean> map = new HashMap<Point,Boolean>();
        map.put(src,true);
        
        Queue<queeNode> q = new LinkedList<queeNode>();
        q.add(new queeNode(src,0));
        int I[] = {-1,0,0,1};
        int J[] = {0,-1,1,0};
        while(!q.isEmpty()){
            queeNode temp = q.peek();
            q.poll();
            if(temp.pt.x == dist.x && temp.pt.y = dist.y){
                return temp.dist;
            }
            for(int i=0;i<I.length;i++){
                int x = temp.pt.x+I[i];
                int y = temp.pt.y+J[i];
                Pair p = new Point(x,y);
                if(isSafe(arr,x,y) && arr[x][x] == 1 && !map[p]){
                    map.put(p,true);
                    queeNode node = new queeNode(p,temp.dist+1);
                    q.add(node);
                }
            }
        }
         return -1;
    }
	public static void main(String[] args) {
	    shortestPath_bfs path = new shortestPath_bfs();
		int[][] mat = new int[][] {
            { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
            { 1, 1, 0, 0, 1, 1, 0, 1, 0, 1 },
            { 0, 1, 1, 0, 1, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
            { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
        };
        Point src = new Point(0, 0);
        Point dist = new Point(7, 7);
        path.findShortestPath(mat,src,dist);
	}
}
