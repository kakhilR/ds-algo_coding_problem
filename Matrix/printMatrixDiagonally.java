package Matrix;

public class printMatrixDiagonally {
    void print_matrx_diagonaly(int[][] arr, int n){
        int i=0;
        int j=0;

        boolean flag= true;
        int k=0;
        while(k<n*2){
            if(flag){
                for(;i>=0 && j<n;j++,i--){
                    System.out.print(arr[i][j]+" ");
                    // k++;
                }
                if(i<0 && j<=n-1){
                    i =0;
                }
                if(j==n){
                    i=i+2;
                    j--;
                }
                System.out.println();
            }
            else{
                for(;i<n && j>=0;i++,j--){
                    System.out.print(arr[i][j]+" ");
                    // k++;
                }
                if(j<0 && i<=n-1){
                    j=0;
                }
                if(i==n){
                    j=j+2;
                    i--;
                }
                System.out.println();
            }
            k++;
            flag = !flag;
        }
        
    }
	public static void main(String[] args) {
		printMatrixDiagonally m = new printMatrixDiagonally();
		int arr[][] = new int[][] { 
		                          { 2, 4, 1, 9 },
                                  { 18,12, 3, 7 },
                                  { 0, 21, 45, 36 },
                                  { 8, 26, 76, 39 } };
                                  
        m.print_matrx_diagonaly(arr,4);
	}
}
