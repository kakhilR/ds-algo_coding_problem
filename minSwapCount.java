// Find minmum swaps count required to bring such that all <= K elements are together.
// A={2,1,4,7,6,3} k=3 A={1,6,9,4,12,3} k=5
public class minSwapCount {
    public static void swapCount(int[] arr, int k){
        int j=0;
        int eleCount =0;
        int eleGrtKCount = Integer.MAX_VALUE;
        int m=0;
        int l=0;
        // count elemt less that k 
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=k){
                eleCount++;
            }
        }
        int n = arr.length-eleCount+1;
        // iterate till the length of array leaving only last no of elemts which are less than k
        while(j<n){
            l=j;
            m = eleCount;
            int count =0;
            while(m>0){
                if(arr[l]>k){
                    count++;
                }
                l++;
                m--;
            }
            j++;
            // return minimum numbers of swaps required
            if(count<eleGrtKCount){
                eleGrtKCount = count;
            }
        }
        System.out.println(eleGrtKCount);
        
    }
    public static void main(String[] args){
        int[] A={1,6,9,4,12,7,3};
	    int k =5;
	    swapCount(A,k);
    }
}
// executable code link
// https://www.onlinegdb.com/edit/fFipgSLCa
