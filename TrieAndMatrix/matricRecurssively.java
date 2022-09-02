package TrieAndMatrix;

public class matricRecurssively {
    static void printMatrix(int[][] arr, int i, int j, int r, int c){
        if(i==r && j==0){
            return;
        }
        System.out.print(arr[i][j]+" ");
        if(j==c-1){
            i++;
            j=0;
            System.out.println();
        }
        else{
            j++;
        }
        printMatrix(arr,i,j,r,c);
    }
    
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12}, { 13, 14, 15, 16}};
		int i=0;
		int j=0;
		int r = arr.length;
		int c = arr[0].length;
		printMatrix(arr,i,j,r,c);
	}
}

// https://onlinegdb.com/xay4jhKVG
