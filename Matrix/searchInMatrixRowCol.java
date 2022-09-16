package Matrix;

public class searchInMatrixRowCol {
    public static int[] searchMatrix(int[][] arr, int num){
        int r = arr.length;
        int c = arr[0].length;
        if(num<arr[0][0] || num>arr[r-1][c-1]){
            return new int[]{-1,-1};
        }
        int i=r-1;
        int j=0;
        while(i>=0 && i<r && j>=0 && j<c){
            if(num == arr[i][j])return new int[]{i,j};
            else if(num<arr[i][j]){
                i--;
            }else{
                j++;
            }
        }
        
        return new int[]{-1,-1};
        
    }
	public static void main(String[] args) {
		int[][] mat= {  {10,11,14,19,24,38},
                        {12,15,18,22,29,40},
                        {17,20,23,25,37,50},
                        {23,28,36,42,57,60} };
                        
        int[] res = searchMatrix(mat,16);
        System.out.println(res[0]);
        System.out.println(res[1]);
	}
}
