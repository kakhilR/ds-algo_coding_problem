public class LIS {
    public static void LISDP(int[] subSeq, int len){
        int maxSeq=Integer.MIN_VALUE;
        int[] dp = new int[len];
        for(int i=0;i<len;i++){
            dp[i] = 1;
        }
        
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(subSeq[i]>subSeq[j] && dp[i]<=dp[j]){
                    dp[i] = dp[i]+1;
                    maxSeq = Math.max(maxSeq,dp[i]);
                }
            }
        }
        int k=0;
        for(;k<=8;k++){
            // if(dp[k] == maxSeq){
                System.out.print(dp[k]+" ");
                // break;
            // }
        }
        System.out.println();
        int x=8;
        int y=8-1;
        while(y>=0){
            // System.out.println(subSeq[x]);
            if(subSeq[x]>subSeq[y] && dp[x] == dp[y]+1){
                System.out.println(subSeq[x]);
                x=y;
                y--;
            }
            y--;
        }
        // return maxSeq;
    }
    
    
	public static void LIS(String[] args) {
		System.out.println("Hello World");
		int[] subSeq = {5,11,6,22,30,18,28,40,50,3,4,2};
		int len = subSeq.length;
		LISDP(subSeq,len);
// 		System.out.println(LISDP(subSeq,len));
	}
}

// https://onlinegdb.com/r-KM2J3N1