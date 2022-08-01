// merege two sorted array of size m+n and n into sorted way 
// A={1,-,5,-,-,10,-} B={3,9,12,14} output = {1,3,5,9,10,12,14}
// in above question move all elements to wards left side and compare small elements and code.
public class mergeTwoArr {

    public static int[] swap(int[] arr,int a, int b){
        int temp;
        temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }

    public static void mergeArr(int[] A,int[] B) {
        int lastInd = A.length-1;
        for(int i=lastInd;i>=0;i--){
            if(A[i]>0){
                swap(A,i,lastInd);
                lastInd--;
            }
        }
        int n = A.length-lastInd;
        int l=0;
        int x=0;
        for(;x<A.length-lastInd;x++){
            if(A[n]<=B[l]){
                A[x] = A[n];
                n++;
            }
            else{
                A[x] = B[l];
                l++;
            }
            x++;
        }
        while(n<A.length && x<A.length){
            if(l<A.length){
                if(A[n]<B[l]){
                    A[x] = A[n];
                    n++;
                }else{
                    A[x]= B[l];
                    l++;
                }
                x++;
            }else{
                A[x] = A[n];
                n++;
                x++;
            }
        }
        while(l<A.length && x<A.length){
            if(n<A.length){
                if(B[l]<A[n]){
                    A[x] = A[l];
                    l++;
                }else{
                    A[x] = A[n];
                    n++;
                }x++;
            }else{
                A[x] = B[l];
                l++;
                x++;
            }
        }

        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
   
    public static void main(String[] args){
        int[] A = {1,0,5,0,0,10,0};
        int[] B = {3,9,12,14};
	    mergeArr(A,B);
    }    
}

// executable code
// https://www.onlinegdb.com/edit/u2Vv0b2H1