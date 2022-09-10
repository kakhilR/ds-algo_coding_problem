package Matrix;

public class minMovesTokillQueen {
    boolean isSafe(int[][] arr,int r, int c, boolean[][] isVisited){
        if(r>0 && c>0 && r<arr.length && c<arr[0].length && (arr[r][c] != -1 && !isVisited[r][c])){
            return true;
        }
        return false;
    }
    
    int findpath(int[][] arr,int sr, int sc, int dr, int dc, boolean isVisited[][], int moves, int count){
        isVisited[sr][sc] = true;
        if(sr == dr && sc == dc){
            if(count<moves){
                moves = count;
                return moves;
            }
        }
        // my moves
        // {-2, -2, 2, 2, -1, -1, 1, 1,};
        // {-1, 1, -1, 1, -2, 2, -2, 2};
        int[] I = {-2, -1, 1, 2, -2, -1, 1, 2 };
        int[] J = {-1, -2, -2, -1, 1, 2, 2, 1 };
        for(int i=0;i<I.length;i++){
            int x = sr+I[i];
            int y = sc+J[i];
            if(isSafe(arr,x,y,isVisited)){
                moves = findpath(arr,x,y,dr,dc,isVisited,moves,count+1);
            }
        }
        return moves;

    }
    public void killQueen(int[][] arr, int sr, int sc, int dr, int dc){
        int moves= Integer.MAX_VALUE;
        
        boolean[][] isVisited = new boolean[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                isVisited[i][j] = false;
            }
        }
        
        findpath(arr,sr,sc,dr,dc,isVisited,moves,0);
    }

    public static void main(String[] args) {
		System.out.println("Hello World");
		minMovesTokillQueen moves = new minMovesTokillQueen();
		int[][] mat = new int[][] {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        int[] src = { 0, 0 };
        int[] dest = { 7, 7 };
        moves.killQueen(mat,src[0],src[1],dest[0],dest[1]);
	}
}

// https://onlinegdb.com/3Qu5wAytGu