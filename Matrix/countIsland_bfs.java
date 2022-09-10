package Matrix;
import java.util.*;

public class countIsland_bfs {
    final static int R=5;
    final static int C=5;
    
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    
    boolean isSafe(int arr[][], int r, int c, boolean isVisted[][]){
        if((r<R) && (r>0) && (c<C) && (c>0) && (arr[r][c] == 1 && !isVisted[r][c])){
            return true;
        }
        return false;
    }
    
    int processNeighbour(int arr[][], int row, int col, boolean isVisted[][], int size){
        Queue<Pair> q = new LinkedList<Pair>();
        int[] I =new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] J =new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            isVisted[temp.row][temp.col] = true;
            for(int i=0;i<I.length;i++){
                int x = temp.row + I[i];
                int y = temp.col + J[i];
                if(isSafe(arr,x,y,isVisted)){
                    size++;
                    q.add(new Pair(x,y));
                };
            }
        }
        return size;
    }

    public void find_island(int arr[][]){
        boolean isVisted[][] = new boolean[R][C];
        int islandCount = 0;
        int maxArea =0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(arr[i][j] == 1 && !isVisted[i][j]){
                    islandCount++;
                    int size=1;
                    size = processNeighbour(arr,i,j,isVisted,size);
                    if(size>maxArea){
                        maxArea = size;
                    }
                }
            }
        }
        System.out.println(maxArea);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		countIsland_bfs countIsland = new countIsland_bfs();
		int arr[][] = new int[][] { 
		                          { 1, 1, 0, 0, 0 },
                                  { 0, 1, 0, 0, 1 },
                                  { 1, 0, 0, 1, 1 },
                                  { 0, 0, 0, 0, 0 },
                                  { 0, 0, 1, 0, 1 } };
        countIsland.find_island(arr);
	}
}

// https://onlinegdb.com/tWIE6wlBX
