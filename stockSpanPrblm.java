
import java.util.*;

// arr ={100,80,60,70,60,75,85}
class pair{
    int key;
    int value;

    public pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}
public class stockSpanPrblm {
    public static void consecutiveSmallEql(int[] A){
        int[] arr = new int[A.length];
        Stack<pair> stack = new Stack<pair>();

        for(int i = 0; i < A.length;i++){
            int count =1;
            if(stack.isEmpty()){
                stack.push(new pair(A[i],i));
                arr[stack.peek().value] = 1;
                continue;
            }
            while(stack.isEmpty() == false && stack.peek().key<=A[i]){
                count = count + arr[stack.peek().value];
                arr[i] = count;
                stack.pop();
            }
            stack.push(new pair(A[i],i));
            arr[stack.peek().value] = 1;
        }
    }
    public static void main(String[] args) {
        int[] A = {100,80,60,70,60,75,85};
        consecutiveSmallEql(A);
    }
}
