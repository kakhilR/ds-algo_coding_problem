public class Main
{
    public static int largestSubArray(int[] arr){
        int maxSofar = Integer.MIN_VALUE;
        int maxLessZero = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum<0){
                sum = 0;
                if(arr[i]>maxLessZero){
                    maxLessZero = arr[i];
                }
            }
            if(sum>maxSofar){
                maxSofar = sum;
            }
        }
        if(maxSofar>0){
           return maxSofar; 
        }else{
            return maxLessZero;
        }
    }
	public static void main(String[] args) {
	    int[] arr = {-2, -1, -3, 4, -1, 2, -1, -5, 4};
		System.out.println(largestSubArray(arr));
	}
}
// link of working
// https://www.onlinegdb.com/edit/Fg2C3cmyM