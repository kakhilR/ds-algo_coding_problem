
import java.util.*;

public class finiteCoinChange {
    
   public static int subSetSum(int[] arr, int sum, int len){
        
        if(sum == 0) return 1;
        
        if(len<=0 || sum<0) return 0;
        
        int exclude = subSetSum(arr, sum, len-1);
        
        int include = subSetSum(arr, sum-arr[len-1], len-1);
        
        return include + exclude;
    }
    
    public static int subSetSumTopDown(int[] arr, int sum, int len, int[][] table){
        if(sum==0) return 1;
        
        if(len<=0 || sum<0) return 0;
        
        int x, y;
        
        if(table[sum][len-1] != -1){
            x = table[sum][len-1];
        }else{
            x = subSetSumTopDown(arr, sum, len-1, table);
        }
        
        if(table[sum-arr[len-1]][len-1] != -1){
            y = table[sum-arr[len-1]][len-1];
        }
        else{
            y = subSetSumTopDown(arr, sum-arr[len-1], len-1, table);
        }
        
        table[sum][len] = x+y;
        
        return x+y;
    }
    
    public static void coinChangeBtmUp(int[] set, int sum, int len){
        int[][] table = new int[len+1][sum+1];
        table[0][0]=1;
        for(int i=1;i<=len;i++){
            for(int k=0;k<=sum;k++){
                table[i][k] = table[i][k]+table[i-1][k];
            }
            int coin = set[i-1];
            for(int j=coin;j<=sum;j++){
                table[i][j] = table[i][j] + table[i-1][j-coin];
            }
        }
        
        for(int i=0;i<len+1;i++){
            for(int j=0;j<sum+1;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void finiteCoinChange(String[] args) {
	    int[] subSet = {3,5,2,8,4,12};
	    int len = subSet.length;
	    int sum = 11;
	    int[][] table = new int [sum+1][len+1];
        for(int[] arr: table){
            Arrays.fill(arr,-1);
        }
	   // System.out.println(subSetSum(subSet, sum, len));
	   //System.out.println(subSetSumTopDown(subSet, sum, len, table));
	   coinChangeBtmUp(subSet,sum,len);
	}
}

// https://onlinegdb.com/Gb6H4SyQm