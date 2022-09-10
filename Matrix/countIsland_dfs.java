package Matrix;

public class countIsland_dfs {
    final static int R=5;
    final static int C=5;
    
    boolean isSafe(int arr[][], int r, int c, boolean isVisted[][]){
        if((r<R) && (r>0) && (c<C) && (c>0) && (arr[r][c] == 1 && !isVisted[r][c])){
            return true;
        }
        return false;
    }
    
    void processNeighbour(int arr[][], int row, int col, boolean isVisted[][]){
        isVisted[row][col] = true;
        int[] I =new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] J =new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        
        for(int i=0;i<I.length;i++){
            int x = row + I[i];
            int y = col + J[i];
            if(isSafe(arr,x,y,isVisted)){
                processNeighbour(arr,x,y,isVisted);
            };
        }
    }
    public void find_island(int arr[][]){
        boolean isVisted[][] = new boolean[R][C];
        int islandCount = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(arr[i][j] == 1 && !isVisted[i][j]){
                    processNeighbour(arr,i,j,isVisted);
                    // System.out.println(islandCount);
                    islandCount++;
                }
            }
        }
        System.out.println(islandCount);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		countIsland_dfs countIsland = new countIsland_dfs();
		int arr[][] = new int[][] { 
		                          { 1, 1, 0, 0, 0 },
                                  { 0, 1, 0, 0, 1 },
                                  { 1, 0, 0, 1, 1 },
                                  { 0, 0, 0, 0, 0 },
                                  { 0, 0, 1, 0, 1 } };
        countIsland.find_island(arr);
	}
}
// code link
// https://onlinegdb.com/SEatvEepF