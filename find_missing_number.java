package ds_algo_array.package1;

import java.util.Arrays;


public class find_missing_number {
	public static void missingNumber(int[] arr,int N) {
		int newArr[] = new int[N+2];
		Arrays.fill(newArr, 1);
		for(int i =0;i<N;i++) {
			int k = arr[i];
			newArr[k] = 0;
		}
		for(int j=1;j<newArr.length;j++) {
			if(newArr[j] == 1){
			    System.out.println(j);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] ={3,2,4,1,6,7,5,8};
		int N = arr.length;
		missingNumber(arr,N);
	}
}