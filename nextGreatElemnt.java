import java.util.*;

class pair{
    int key;
    int value;
    public pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class nextGreatElemnt{

    // in get the next great elemnt in the order of given array
    public static void nextGreatElement(int[] A){
        int n = A.length;
        int[] arr = new int[n];
        Stack<pair> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(new pair(A[i],i));
                continue;
            }
            while((stack.isEmpty() == false) && stack.peek().key < A[i]){
                arr[stack.peek().value] = stack.peek().key;
                stack.pop();
            }
            stack.push(new pair(A[i],i));
        }
        while(stack.isEmpty() == false){
            arr[stack.peek().value] = -1;
            stack.pop();
        }
        for(int i=0;i<arr.length;i++){
		   System.out.print(" "+arr[i]); 
		}
		System.out.println();
    }
	public static void main(String[] args) {
		int[] A = {8,7,3,2,4,9,5,4,6};
// 		System.out.println();
		nextGreatElement(A);
		for(int i=0;i<A.length;i++){
		   System.out.print(" "+A[i]); 
		}
	}
}

// get the next greate elemnt without the array order
// public static void nextGreatElement(int[] A){
//         Stack<Integer> stack = new Stack<>();
//         int j=0;
//         for(int i=0;i<A.length;i++){
//             j=i;
//             if(stack.isEmpty()){
//                 stack.push(A[i]);
//                 continue;
//             }
//             while((stack.isEmpty() == false) && stack.peek()<A[i]){
//                 System.out.println(stack.peek()+"-->"+A[i]);
//                 stack.pop();
//             }
//             stack.push(A[i]);
//         }
//         while(stack.isEmpty() == false){
//             System.out.println(stack.peek()+"--> -1");
//             stack.pop();
//         }
//     }
