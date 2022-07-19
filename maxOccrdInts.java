import java.util.*;

public class maxOccrdInts {
// without hash map
// time complexity (N+M)
    public static void maxOccurdInts(int n,int[] left, int[] right){
        int[] arr = new int[100002];
        int max = -1;
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            arr[left[i]]+=1;
            arr[right[i]+1] -=1;
            if(right[i]>max){
                max = right[i];
            }
        }
        int max_sum = arr[0];
        int ind=0;
        // int[] Arr = new int[max+1];
        for(int i=1;i<max+1;i++){
            arr[i] += arr[i-1];
            if(max_sum<arr[i]){
                max_sum = arr[i];
                ind = i;
            }
            
        }
        System.out.println(arr[ind]);
        
    }

	public static void main(String[] args) {
	    int[] left = {2,3,1,0};
	    int[] right = {20,7,5,4};
	    int n = left.length;
	    maxOccurdInts(n,left,right);
	}
}
// link of working code
// https://www.onlinegdb.com/edit/EtgZdy5m7


// with hash map
// time complexity (N*m) N=ranges, m=max value in a range

// public static void maxOccurdIntsHashMap(int n, int[] left, int[] right){
//     HashMap <Integer, Integer> myMap = new HashMap<>();  
//     for(int i =0;i<n;i++){
//         for(int j=left[i];j<right[i]+1;j++){
//             if(myMap.containsKey(j)){
//                 myMap.put(j,myMap.get(j)+1);
//             }
//             else{
//                 myMap.put(j,1);
//             }
//         }
//     }
//     for(Map.Entry entry :myMap.entrySet()){
//         System.out.println(entry.getKey()+" "+entry.getValue() );
//     }
// // }
