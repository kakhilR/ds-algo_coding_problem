package TrieAndMatrix;

public class martrixNQueen {
    final static int N = 4;
    static boolean isSafe(int[][] board,int r, int p){
        int i = p;
        int j = p;
        while(j<r){
            if(board[i][j] == 1){
                return false;
            }
            j++;
        }
        j = p;
        while(j>=0){
            if(board[i][j] == 1){
                return false;
            }
            j--;
        }
        j=p;
        i=p;
        while(i<r){
            if(board[i][j] == 1){
                return false;
            }
            i++;
        }
        i=p;
        while(i>=0){
            if(board[i][j] == 1){
                return false;
            }
            i--;
        }
        i=p;
        while(i>=0 && j>=0){
            if(board[i][j] == 1){
                return false;
            }
            i--;
            j--;
        }
        i=p;
        j=p;
        while(i<r && j<r){
            if(board[i][j] == 1){
                return false;
            }
            i++;
            j++;
        }
        i=p;
        j=p;
        while(i<r && j>=0){
            if(board[i][j] == 1){
                return false;
            }
            i++;
            j--;
        }
        i=p;
        j=p;
        while(i<r && j<r){
            if(board[i][j] == 1){
                return false;
            }
            i++;
            j++;
        }
        return true;
        
    }
    
    static boolean nQueen(int[][] board,int r, int n){
        if(r>=N){
            return true;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board, r, i)){
                System.out.println(r+ "isSafe");
                board[r][i] = 1;
            }
            if(nQueen(board, r+1, n)== true){
                return true;
            }
            board[r][i] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
	   // Main func = new Main();
		int[][] board = { 
		    { 0, 0, 0, 0}, 
		    { 0, 0, 0, 0}, 
		    { 0, 0, 0, 0}, 
		    { 0, 0, 0, 0}
		};
// 		int r = board.length;
		System.out.println(nQueen(board,0,4));
	}
}

// https://onlinegdb.com/Ymcav--4Z