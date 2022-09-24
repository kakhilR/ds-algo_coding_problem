public class findMinInsPalindrome {
    public static int findMinInsertions(String str, int s, int e){
        if(s == e) return 0;
        if(s==e-1 && str.charAt(s) == str.charAt(e-1)) return 0;
        if(s==e-1 && str.charAt(s) != str.charAt(e-1)) return 1;
        if(str.charAt(s) == str.charAt(e-1)){
            return findMinInsertions(str,s+1,e-1);
        }else{
            return 1+Math.min(findMinInsertions(str,s+1,e),findMinInsertions(str,s,e-1));
        }
    }
    
    static int findMinInsertionsDP(String str, int n){
        int table[][] = new int[n][n];
        for(int i=1;i<n;i++){
            for(int j=0,k=i; k<n && j<n; ++k,++j){
                if(str.charAt(j)==str.charAt(k)){
                    table[j][k] = table[j+1][k-1];
                }else{
                    table[j][k] = (Integer.min(table[j][k-1], table[j+1][k])+1);
                }
            }
        }
        return table[0][n-1];
    }
 
	public static void findMinInsPalindrome(String[] args) {
		String str = "abcae";
		int s=0;
		int e =str.length();
// 		System.out.println(findMinInsertions(str,s,e));
		System.out.println(findMinInsertionsDP(str,e));
	}
}
// https://onlinegdb.com/CvEfjV0eC