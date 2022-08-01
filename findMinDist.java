// {3,5,4,2,6,5} x=3,y=6 output= min distant btween x and y is 4 
// {4,9,3,7,6,2,5,2,3} x=3,y=2 output= min distant btween x and y is 1
public class findMinDist
{
    public static void minDistTwoEle(int[] arr, int x, int y){
        int minDist = Integer.MAX_VALUE;
        int pointer1=0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == x || arr[i] == y){
                // System.out.println(arr[i]);
                pointer1 = i;
                // System.out.println(pointer1);
            for(;i<arr.length;i++){
                count++;
                // System.out.println(pointer1);
                if(arr[i] == x || arr[i]==y){
                    if(arr[i] == arr[pointer1]){
                        pointer1 = i;
                    }else{
                        System.out.println(pointer1+"pointer");
                        System.out.println(i+"i");
                        if(count<minDist){
                          minDist = count; 
                          count =0;
                          pointer1=i;
                        }
                    }
                }
            }
                  
            }
        }
        System.out.println(minDist+"mindist");
    }
    
	public static void main(String[] args) {
		int[] arr = {4,9,3,7,6,2,5,2,3};
		int x=3;
		int y=2;
		minDistTwoEle(arr,x,y);
	}
}
// link of working
// https://www.onlinegdb.com/edit/xIdVINdOWp