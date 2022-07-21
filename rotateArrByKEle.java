// rotate array by k elements right side.
// A={10,20,30,40,50,60,70} k=3 output={40,50,60,70,10,20,30} A={1,6,9,4,7,12,3} k=5 output ={12,3,4,6,9,4,7}
import java.util.*;
public class rotateArrByKEle {
    public static int[] swap(int[] arr,int a, int b){
        int temp;
        temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }

    public static int[] reversArray(int[] arr){
        // first revers the complete array
        int i=0;
        int j=arr.length-1;
        int mid = arr.length/2;
        while(i<mid){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    
    public static void rotateArray(int[] arr, int k){
        reversArray(arr);
        int[] arr1 = Arrays.copyOfRange(arr,arr.length-k,arr.length);
        reversArray(arr1);
        arr =  Arrays.copyOfRange(arr, 0,arr.length-k);
        reversArray(arr);
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]); 
        }
        for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]); 
        }
    }

    public static void main(String[] args){

    }
}
//  executable code link
// https://www.onlinegdb.com/edit/Npfk3FdoW