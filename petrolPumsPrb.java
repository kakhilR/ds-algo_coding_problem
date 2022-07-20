// p =    {5,3,12,1,7}
// dist = {8,4,7,4,5}
public class petrolPumsPrb
{
    // asuming that both arrs equal length
    public static void petrolPums(int[] p,int[] dist, int n){
        int lastleft=0;
        int maxPetrolLeft = Integer.MAX_VALUE;
        int ind = 0;
        int position =0;
        while(position<n){
            lastleft += p[position];
            lastleft -= dist[position];
            position++;
            if(lastleft<maxPetrolLeft){
                maxPetrolLeft = lastleft;
                ind = position%n;
            }
        }
        System.out.println(ind);
        // System.out.println(ind);
        // int lastleft=0;
        // int minPetrolLeft = Integer.MAX_VALUE;
        // int minPosition = 0;
        // int position=0;
        // while(position<n){
        //     lastleft += p[position];
        //     lastleft -= dist[position];
        //     position++;
        //     if(lastleft<minPetrolLeft){
        //         minPetrolLeft = lastleft;
        //         minPosition = position % n;
        //     }
        // }
    }
	public static void main(String[] args) {
	    int[] p = {4, 6, 6, 5};
	    int[] dist = {7, 3, 4, 5};
	    int n= p.length;
	    petrolPums(p,dist,n);
		System.out.println("Hello World");
	}
}

// https://www.onlinegdb.com/edit/WkUGyDEPW




