package Matrix;

public class shortestPath_dfs {
    boolean isSafe(int arr[][], int r, int c, boolean isVisted[][]){
        if((r<arr.length) && (r>=0) && (c<arr[0].length) && (c>=0) && (arr[r][c] == 1 && !isVisted[r][c])){
            return true;
        }
        return false;
    }
    
    public int findPath(int[][] arr, int r, int c, int dr, int dc, boolean isVisited[][], int minDist, int dist){
        // System.out.println(r+"r");
        // System.out.println(c+"c");
        // System.out.println(dr);
        // System.out.println(dc);
        
        if( r==dr && c == dc ){
            minDist = Math.min(dist,minDist);
            return minDist;
        }
        isVisited[r][c] = true;
        
        int[] I =new int[] { 1, 0, -1, 0 };
        int[] J =new int[] { 0, 1, 0, -1 };
        
        for(int i=0;i<I.length;i++){
            int x = r+I[i];
            int y = c+J[i];
            if (isSafe(arr,x,y,isVisited)){
                minDist = findPath(arr,x,y,dr,dc,isVisited,minDist,dist+1);
            } 
        }
        
        // isVisited[r][c] = false;
        return minDist;
        
    }
    public int shortestpath(int[][] arr, int[] src, int[] dest){
        int minDist = Integer.MAX_VALUE;
        int row = arr.length;
        int col = arr[0].length;
        boolean isVisited[][] = new boolean[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                isVisited[i][j] = false;
            }
        }
        
        minDist = findPath(arr, src[0], src[1], dest[0], dest[1], isVisited, minDist, 0);
        
        if(minDist!=Integer.MAX_VALUE){
            return minDist;
        }
        
        return -1;
        
        
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		shortestPath_dfs path = new shortestPath_dfs();
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
        int[] src = { 0, 0 };
        int[] dest = { 7, 7 };
        System.out.println(path.shortestpath(mat,src,dest));
	}
}

// https://onlinegdb.com/NwkHGjmL1