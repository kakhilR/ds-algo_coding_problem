public class findEle_MinDiff_eqEle_K {

	public static void sumTwoEleEqlK(int[] arr1, int[] arr2, int k) {
		int i=0;
		int j = arr2.length-1;
		int minDiff = Integer.MAX_VALUE;
		int sum = 0;
		int curri=0;
		int currj=0;
		while(i<arr1.length && j>=0) {
    	    sum = arr1[i]+arr2[j];
    	    if(Math.abs(sum-k)<minDiff){
    		    minDiff = Math.abs(sum-k);
    		    curri = arr1[i];
    		    currj = arr2[j];
    	    }
    	    if(sum>k){
    	       j--; 
    	    }else{
    	      i++;  
    	    }
		}
		System.out.println(currj);
		System.out.println(curri);
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,9,10};
		int[] arr2 = {14,19,24,31,40,51};
		int k = 27;
		sumTwoEleEqlK(arr1,arr2,k);
	}
	
}

//{2,4,6,8,9,10}
//{14,19,24,31,40,51}
//k=27