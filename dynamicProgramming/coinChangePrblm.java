
import java.util.*;

public class coinChangePrblm {
    public static int coinChange(int[] coins, int sum, int len, ArrayList<Integer> list){
        
        if(sum == 0) {
            for(int i =0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            return 1;
        };
        
        if(sum<0 || len<=0 ) return 0;
        
        
        int exclud = coinChange(coins, sum, len-1, list);
        // list.add(coins[len-1])
        int includ = coinChange(coins, sum-coins[len-1], len, list);
        
        return exclud+includ;
    }
    
    // dp top down approch
    public static int coinChangeDP(int[] coins, int sum, int len, int[][] table){
        if(sum == 0) return 1;
        if(sum<0 || len<=0) return 0;
        int x=0;
        int y=0;
        
        if(table[sum][len-1]!=-1){
            x = table[sum][len-1];
        }else{
            x = coinChangeDP(coins, sum, len-1, table);
        }
        
        if(table[sum-coins[len-1]][len] != -1){
            y = table[sum-coins[len-1]][len];
        }else{
            y = coinChangeDP(coins, sum-coins[len-1], len, table);
        }
        
        table[sum][len] = x+y;
        return x+y;
    }
    
    public static int coinChangeBtmUp(int[] coins, int sum, int len, int[][] table){
        for(int i=0;i<=table.length;i++){
            table[i][0] = 1;
        }
        for(int j=0;j<=table[0].length;j++){
            table[0][j] = 1;
        }
        
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[0].length;j++){
                if(coins[j-1]>i){
                    table[i][j] = table[i][j-1];
                }else{
                    table[i][j] = table[i-coins[j-1]][j] + table[i][j-1];
                }
            }
        }
        return table[sum][coins.length];
    }
    
	public static void main(String[] args) {
		int[] coins = {1,2,3};
		int sum = 4;
		int len = coins.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		// System.out.println(coinChange(coins, sum, len, list));
// 		coinChange(coins, sum, len, list);
        int[][] table = new int [sum+1][len+1];
        for(int[] arr: table){
            Arrays.fill(arr,-1);
        }
        // System.out.println(coinChangeDP(coins, sum, len, table));
        coinChangeBtmUp(coins, sum, len, table);
	}
}

// https://onlinegdb.com/o2g5kPOJki