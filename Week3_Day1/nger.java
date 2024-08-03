package Week3_Day1;


public class nger {
    //Next greatest element to right
      static  int[] NGER(int[] arr){
            int maxElement=0;
            int[] nger=new int[arr.length];
            for (int i = arr.length-1; i >0; i--) {
                nger[i]=maxElement;
                maxElement=Math.max(maxElement, arr[i]);
            }
                return nger;
        }
        public static void main(String[] args) {
            int[] arr={7,1,3,4,9,6,4};
            int[] num=NGER(arr);
            for (int i : num) {
                System.out.print(i + " ");
            }
        }
    }

