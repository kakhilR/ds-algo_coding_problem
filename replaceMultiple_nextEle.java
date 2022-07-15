package ds_algo_array.package1;

public class replaceMultiple_nextEle {
	public static void replace_multiple_next_ele(int[] arr, int len){
        int i=1;
        int prev = arr[0];
        int curr;
        arr[0] = prev*arr[i];
        while(i<arr.length-1){
            curr = arr[i];
            arr[i] = prev * arr[i+1];
            prev = curr;
            i++;
        }
        arr[len] = prev*arr[len];
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    
	public static void main(String[] args) {
	    int[] arr = {2,4,5,7,8};
	    int len = arr.length-1;
		replace_multiple_next_ele(arr, len);
	}

}
