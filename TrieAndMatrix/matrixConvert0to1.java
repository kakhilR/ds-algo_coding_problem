package TrieAndMatrix;

import java.util.Arrays;

/******************************************************************************
{ 1, 0, 0, 1},       { 1, 1, 1, 1},
{ 0, 0, 0, 0},       { 1, 1, 0, 1},
{ 0, 1, 0, 1},  ->   { 1, 1, 1, 1}, 
{ 1, 0, 0, 1}        { 1, 1, 1, 1}

*******************************************************************************/

public class matrixConvert0to1 {
    static void toggleRowCol(int[][] arr, int r, int c){
        int[] row = new int[r];
        int[] col = new int[c];
        Arrays.fill(row,0);
        Arrays.fill(col,0);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == 1 ){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int k=0;k < row.length;k++){
            for(int l=0;l<col.length;l++){
                if(row[k]==1 || col[l]==1){
                    arr[k][l]=1;
                }
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
	public static void main(String[] args) {
		int[][] arr = { 
		    { 1, 0, 0, 1}, 
		    { 0, 0, 0, 0}, 
		    { 0, 1, 0, 1}, 
		    { 1, 0, 0, 1}
		};
		int r = arr.length;
		int c = arr[0].length;
		toggleRowCol(arr,r,c);
	}
}

// https://onlinegdb.com/fU_pvsT7b