package Week3_Day2;

public class NGEL {
    //next greatest element left 
    static  int[] NGEL(int[] arr){
        int maxElement=0;
        int[] ngel=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            ngel[i]=maxElement;
            maxElement=Math.max(maxElement, arr[i]);
        }
            return ngel;
    }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        int[] num=NGEL(arr);
        for (int i : num) {
            System.out.print(i + " ");
            for (int j : num) {
                
            }
        }
    }
}
