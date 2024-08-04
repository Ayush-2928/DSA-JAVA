package Week3_Day2;

public class nser {
    static  int[] NSER(int[] arr){      //arr is original array
                                        //nser is new array (the final edited array)
        int minElement=Integer.MAX_VALUE;
        int[] nser=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            if(minElement==Integer.MAX_VALUE){
                nser[i]=0;
            }
            else
            nser[i]=minElement;
            minElement=Math.min(minElement, arr[i]);
        }
            return nser;
    }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        int[] nser=NSER(arr); //here nser can be num and 
        for (int i : nser) {   //then nser can be replaced by num here
            System.out.print(i + " ");
        }
    }
}

