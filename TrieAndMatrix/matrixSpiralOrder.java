package TrieAndMatrix;

public class matrixSpiralOrder {
    static void printMatrixSpiralOrder(int[][] arr, int r, int c){
        int stR=0;
        int stC=0;
        int endR = r-1;
        int endC = c-1;
        // System.out.println(endR+"endR");
        // System.out.println(endC+"endc");
        int i;
        int j;
        while(stR<endR && stC<endC){
            i = stR;
            for(j=stC;j<=endC;j++){
                System.out.println(arr[i][j]);
            }
            j--;
            i++;
            stR++;
        System.out.println(j+"j");
            for(;i<=endR;i++){
                System.out.println(arr[i][j]);
            }
            endC--;
            // j--;
            for(;j>=stC;j--){
                System.out.println(arr[i][j]);
            }
            endR--;
            i--;
            for(;i>=stR;i--){
                System.out.println(arr[i][j]);
            }
            j++;
            stC++;
        }
        
    }
    
	public static void main(String[] args) {
		int[][] arr = { 
		    { 1, 2, 3, 4 }, 
		    { 5, 6, 7, 8 }, 
		    { 9, 10, 11, 12}, 
		    { 13, 14, 15, 16}
		    
		};
		int r = arr.length;
		int c = arr[0].length;
		printMatrixSpiralOrder(arr,r,c);
	}
}

// https://onlinegdb.com/8zgw0Yqlk