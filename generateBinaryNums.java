import java.util.*;

public class generateBinaryNums
{
    public static void binaryNumbs(int n){
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        int count=1;
        while(count<=n){
            String binary1 = q.peek();
            System.out.println(q.peek());
            q.remove();
            String binary2 = binary1;
            q.add(binary1+"0");
            q.add(binary2+"1");
            n--;
        }
    }
    
	public static void main(String[] args) {
	    int n =5;
	    binaryNumbs(n);
	}
}
