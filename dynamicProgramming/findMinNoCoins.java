public class findMinNoCoins {
    public static int coinChange(int[] coins, int amount){
        if(amount ==0) return 0;
        int minCoins = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amount){
                int ans = coinChange(coins,amount-coins[i]);
                System.out.println(ans+" ans"+i);
                if(ans != Integer.MAX_VALUE && ans+1<minCoins){
                    minCoins = ans+1;
                }
            }
        }
        
        return minCoins;
    }
    
    public static int bottomUp(int[] coins, int amount){
        int[] table = new int[amount+1];
        
        for(int i=1;i<table.length;i++){
            table[i] = Integer.MAX_VALUE;
        }
        
        
        
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    int res = table[i-coins[j]];
                    if(res != Integer.MAX_VALUE && res+1 < table[i]){
                        table[i] = res+1;
                    }
                }
            }
        }
        for(int k=0;k<=amount;k++){
            System.out.println(table[k]+" from");
        }
        return table[amount];
    }
	public static void main(String[] args) {
		int[] coins = {1,2,5}; 
		int amount = 11;
// 		int len = coins.length;
// 		int n = Integer.MAX_VALUE;
// 		System.out.println(coinChange(coins, amount));
        System.out.println(bottomUp(coins, amount));
	}
}

// https://onlinegdb.com/NVJr5to9yZ