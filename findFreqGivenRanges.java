import java.util.*;

public class findFreqGivenRanges {
    public static void findFrequencyEle(int[] A, int l1,int r1){
        HashMap<Integer, ArrayList<Integer>> myMap = new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0;i<A.length;i++){
            if(myMap.containsKey(A[i])){
                myMap.get(A[i]).add(i);
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            myMap.put(A[i],list);
        }
        System.out.println(myMap.size());
        
        
    }
	public static void main(String[] args) {
	    int[] A = {2,8,6,9,8,6,8,2,11,3,3};
	    int l1 = 1;
	    int r1 = 5;
	    findFrequencyEle(A, l1, r1);
		System.out.println("Hello World");
	}
    
}

// executable code
// https://www.onlinegdb.com/edit/weFycuJ5y
