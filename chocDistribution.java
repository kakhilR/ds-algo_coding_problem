// find choc distribution such that the difference between a person gets min, and max choc, is least. 
// arr[] ={3,4,1,9,56,7,9,12} m=5 output = min diff is 6;

import java.util.*;

public class chocDistribution {
    public static int[] mergeArray(int[] A, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = A[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = A[mid+1+j];
        }
        
        int k=l;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            A[k] = L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            A[k] = R[j];
            j++;
            k++;
        }
        
       return A;
        
    }
    public static int[] sort(int[] A,int l,int r){
        if(l<r){
            int mid = l+(r-l)/2;
            sort(A,l,mid);
            sort(A,mid+1,r);
            mergeArray(A,l,mid,r);
        }
        return A;
    }
    public static void chocDistribution(int[] arr,int k){
        int minDif = Integer.MAX_VALUE;
        int p = 0;
        int currDiff = 0;
        int indI=0;
        int indP=0;
        for(int i=0;i<arr.length;i++){
            p = i+k-1;
            if(p<arr.length){
                currDiff = Math.abs(arr[i] - arr[p]);   
                if(currDiff<minDif){
                    minDif = currDiff;
                    indI = i;
                    indP = p;
                }  
            }
        }
        for(int j=indI;j<=indP;j++){
           System.out.println(arr[j]); 
        }
    }
	public static void main(String[] args) {
	    int[] A = {3,4,1,9,56,7,9,12};
	    int l=0;
	    int r =A.length-1;
	    sort(A,l,r);
	    chocDistribution(A,5);
// 		System.out.println("Hello World");
	}
}

// link executable code
// https://onlinegdb.com/KhAHiy8nH
