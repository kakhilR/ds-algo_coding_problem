public class houseRobber {
    public static int houseRob(int[] arr, int n){
        if(n<0){
            return 0;
        }
        
        if(n==0) return arr[0];
        
        int sum1 = houseRob(arr, n-1);

        int sum2 = arr[n] + houseRob(arr, n-2);
        
        return Math.max(sum1,sum2);
        // return Math.max(houseRobber(arr, n-1, sum),houseRobber(arr, n, sum+arr[n-1]));
    }
    
    public static int bottomUp(int[] arr, int n){
        int[] table = new int[2];
        
        for(int i=0;i<n;i = i+2){
            table[0] += arr[i];
        }
        for(int j=1;j<n;j = j+2){
            table[1] += arr[j];
        }
        
        return Math.max(table[0],table[1]);
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		int arr[] = { 6, 7, 1, 3, 8, 2, 4 };
		int n = arr.length;
		int sum=0;
// 		System.out.println(houseRob(arr, n-1));
		System.out.println(bottomUp(arr,n));
	}
}

// https://onlinegdb.com/1lWPll0MS