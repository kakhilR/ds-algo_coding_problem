// a = {4,3,7,8,6,2,1}
// output = {3,7,4,8,2,6,1,10,9,13,12,15,19}
//
public class array_zig_zag {

	public static int[] swap(int[] arr,int a, int b){
        int temp;
        temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }
	public static void zigZag(int[] arr){
        int prev;
        int curr;
        int next;
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                if(arr[i]<arr[i-1]){
                    prev = i-1;
                    curr = i;
                    swap(arr,curr,prev);
                }
                if(arr[i]<arr[i+1]){
                    next = i+1;
                    curr =i;
                    swap(arr,curr,next);
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};
        zigZag(arr);
    }
}

// link for executable code
// https://www.onlinegdb.com/edit/wCIRkRPFG