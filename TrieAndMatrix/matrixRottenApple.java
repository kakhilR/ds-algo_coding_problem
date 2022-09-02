package TrieAndMatrix;

import java.util.LinkedList;
import java.util.Queue;

/******************************************************************************
consider 
0->no apple
1-> fresh apple
2-> rotten apple
in how many iterations all apples will be rotten
*******************************************************************************/

public class matrixRottenApple {
    class location{
        int x;
        int y;
        location(int i, int j){
            this.x=i;
            this.y=j;
        }
    }
    void timetoRotApple(int[][] arr, int r, int c){
        Queue<location> q1 = new LinkedList<location>();
        Queue<location> q2 = new LinkedList<location>();
        int appCount = 0;
        int rotCount =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == 1){
                    location myObj1 = new location(i,j);
                    q1.add(myObj1);
                }
                if(arr[i][j] == 2){
                    location myObj2 = new location(i,j);
                    q2.add(myObj2);
                }
            }
        }
        
        while(!q1.isEmpty() && !q2.isEmpty()){
            int q1Count = q1.size();
            int q2Count = q2.size();
            while(q1Count>0){
                location temp1 = q1.peek();
                int i1 = temp1.x;
                int j1 = temp1.y;
                if(arr[i1][j1] == 1){
                    appCount++;
                    break;
                }
                q1.poll();
                q1Count--;
            }
            while(q2Count>0){
                location temp2 = q2.peek();
                int i = temp2.x;
                int j = temp2.y;
                if(i-1>=0){
                    if(arr[i-1][j] == 1){
                        arr[i-1][j] = 2;
                        location myObj2 = new location(i-1,j);
                        q2.add(myObj2);
                    }
                }
                if(i+1<r){
                    if(arr[i+1][j] == 1){
                        arr[i+1][j] = 2;
                        location myObj2 = new location(i+1,j);
                        q2.add(myObj2);
                    }
                }
                if(j-1>=0){
                    if(arr[i][j-1] == 1){
                        arr[i][j-1] = 2;
                        location myObj2 = new location(i,j-1);
                        q2.add(myObj2);
                    }
                }
                if(j+1<c){
                    if(arr[i][j+1] == 1){
                        arr[i][j+1] = 2;
                        location myObj2 = new location(i,j+1);
                        q2.add(myObj2);
                    }
                }
                q1.poll();
                q2.poll();
                q2Count--;
            }
            rotCount++;
        }
        System.out.println(appCount);
    }
	public static void main(String[] args) {
	    matrixRottenApple func = new matrixRottenApple();
		int[][] arr = { 
		    { 0, 2, 1, 0}, 
		    { 0, 1, 0, 0}, 
		    { 0, 2, 0, 0}, 
		    { 1, 1, 1, 1},
		    { 1, 0, 1, 1}
		};
		int r = arr.length;
		int c = arr[0].length;
		func.timetoRotApple(arr,r,c);
	}
}

// https://onlinegdb.com/ZtMmMZxD6