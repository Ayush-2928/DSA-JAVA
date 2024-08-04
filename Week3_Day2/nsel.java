package Week3_Day2;

public class nsel {
    
    static  int[] NSEL(int[] arr){      //arr is original array
                                         //nser is new array (the final edited array)
    int minElement=Integer.MAX_VALUE;
    int[] nsel=new int[arr.length];
    for (int i = 0; i<arr.length; i++) {
    if(minElement==Integer.MAX_VALUE){
    nsel[i]=0;
    }
        else
        nsel[i]=minElement;
        minElement=Math.min(minElement, arr[i]);
    }
    return nsel;
    }
    public static void main(String[] args) {
    int[] arr={3,7,2,5,8,4,9,1,6};
    int[] nser=NSEL(arr); //here nser can be num and 
    for (int i : nser) {   //then nser can be replaced by num here
    System.out.print(i + " ");
    }
  }
}

