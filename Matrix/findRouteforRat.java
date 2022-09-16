package Matrix;

import java.util.*;
public class findRouteforRat {
    
    public static boolean isSafe(int[][] arr,int r, int c, int n, int m, boolean isVisted[][]){
        if(r>=0 && c>=0 && r<n && c<m && (arr[r][c] == 1 && !isVisted[r][c])){
            return true;
        }
        return false;
    }
    
    public static List<List<Integer>> dfs(int[][] arr, int r, int c, int n, int m, boolean isVisted[][], List<List<Integer>> list){
        isVisted[r][c] = true;
        if(r==n && c == m) return list;
        int I[] = {-1,0,0,1};
        int J[] = {0,-1,1,0};
        for(int i=0;i<I.length;i++){
            int x = r+I[i];
            int y = c+J[i];
            if(isSafe(arr, x, y, n, m, isVisted)){
                List<Integer> l = new ArrayList<Integer>();
                l.add(x);
                l.add(y);
                // System.out.print(l);
                // // System.out.println(y);
                list.add(l);
                dfs(arr, x, y, n, m, isVisted, list);
            }
        }
        
        isVisted[r][c] = false;
        return list;
    }
    
    public static void findRoute(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        boolean isVisted[][] = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                isVisted[i][j] = false;
            }
        }
        dfs(arr, 0, 0, r, c, isVisted, list);
        for(List<Integer> nums : list){
            System.out.print(nums+" ");
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] mat = new int[][] {
            { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 0, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
            { 0, 1, 1, 0, 1, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
            { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
        };
        
        findRoute(mat);
	}
}

// https://onlinegdb.com/8kRuHodWbX