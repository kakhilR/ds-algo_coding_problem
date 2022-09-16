package Matrix;

public class findMax1sforEachRow {
    static int util(int[] arr){
        int ind=0;
        int i=0;
        int len = arr.length;
        while(i<len){
            len = len-i;
            int mid = (len)/2;
            mid = mid+i;
            if(arr[mid] == 1){
                while(mid>=i){
                    if(arr[mid] == 1){
                        ind = mid;
                        mid--;
                    }
                    else{
                        return ind;
                    }
                }
            }
            i = mid;
        }
        return ind;
    }
    public static int findRow_MaxOnes(int[][] arr){
        int max_ones=Integer.MAX_VALUE;
        int j = util(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(j>=0 && arr[i][j]==1){
                j = j-1;
                max_ones = i;
            }
        }
        return max_ones;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] mat = new int[][] {
            { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
            { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 },
            { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }
        };
        // findRow_MaxOnes(mat);
        System.out.println(findRow_MaxOnes(mat));
	}
    
}
