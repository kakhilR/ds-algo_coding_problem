public class LCS {
    public static int LCSRecrrs(String str1, String str2, int s1, int s2, int n, int m){
        if(s1>=n || s2>=m) return 0;
        if(str1.charAt(s1) == str2.charAt(s2)) {
            return 1+LCSRecrrs(str1, str2, s1+1, s2+1, n, m);
        }
        else{
            return Math.max(LCSRecrrs(str1, str2, s1+1, s2, n, m), LCSRecrrs(str1, str2, s1, s2+1, n, m));
        }
    }
    
    public static int LCSbottmUp(String str1, String str2, int n, int m){
        int[][] table = new int[n+1][m+1];
        for(int i=0;i<table.length;i++){
            table[i][0] = 0;
        }
        for(int j=0;j<table[0].length;j++){
            table[0][j] = 0;
        }
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    table[i][j] = 1+table[i-1][j-1];
                }else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }
        // print common sub string
        int strlen = table[n][m];
        int[] str = new int [strlen];
        int k=str1.length();
        int l=str2.length();
        while(k>0 && l>0){
            System.out.println(k+" k");
        System.out.println(l+" l");
            if(str1.charAt(k-1) == str2.charAt(l-1)){
                str[strlen-1] = str1.charAt(k-1);
                strlen--;
                k--;
                l--;
            }
            else if(table[k-1][l]>table[k][l-1]){
                k--;
            }
            else{
                l--;
            }
        }
        
        for(int x=0;x<str.length;x++){
            System.out.println(str[x]);
        }
        return table[n][m];
    }
    
    
	public static void main(String[] args) {
		String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        
        int s1 =0;
        int s2 =0;
        
        int n = str1.length();
        int m = str2.length();
        
        // System.out.println(LCSRecurs(str1, str2, s1, s2, n, m));
        System.out.println(LCSbottmUp(str1,str2,n,m));
	}
}

// https://onlinegdb.com/D_Rwkc0YSI