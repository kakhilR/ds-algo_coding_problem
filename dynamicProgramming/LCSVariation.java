public class LCSVariation {
    public static int LCS(int[] subSeq1, int[] subSeq2, int i, int j){
        if(i<=0 || j<=0) return 0;
        if(subSeq1[i-1] == subSeq2[j-1]){
            return 1+LCS(subSeq1, subSeq2, i-1, j-1);
        }
        else{
            return Integer.max(LCS(subSeq1, subSeq2, i-1, j),LCS(subSeq1, subSeq2, i, j-1));
        }
    }
    
    public static int LCSBtUp(int[] subSeq1, int[] subSeq2, int i, int j){
        int[][] table = new int[i+1][j+1];
        for(int k=0;k<table.length;k++){
            table[k][0] = 0;
        }
        for(int l=0;l<table[0].length;l++){
            table[0][l]=0;
        }
        
        for(int k=1;k<table.length;k++){
            for(int l=1;l<table[0].length;l++){
                if(subSeq1[k-1]==subSeq2[l-1]){
                    table[k][l] = 1+table[k-1][l-1];
                }else{
                    table[k][l] = Integer.max(table[k-1][l],table[k][l-1]);
                }
            }
        }
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                System.out.print(table[x][y]+" ");
            }
            System.out.println();
        }
        return table[i-1][j-1];
    }
    
	public static void main(String[] args) {
	    int[] subSeq1 = {1,6,2,5,3,4,7};
	    int[] subSeq2 = {1,2,3,4,5,6,7};
	    int n= subSeq1.length;
	    int m= subSeq2.length;
	   // LCS(subSeq1,subSeq2, n, m);
// 		System.out.println(LCS(subSeq1,subSeq2, n, m));
        System.out.println(LCSBtUp(subSeq1,subSeq2, n, m));
	}
}

// https://onlinegdb.com/dOpGi_eHi