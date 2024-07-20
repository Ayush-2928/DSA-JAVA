package Week1;
//return the sum of your array : 1,2,3,4,5
// print an array in reverse order:5,4,3,2,1 - run for loop in opp direction ,eg i=5
// reverse the array
public class hw {
    //return the sum of your array : 1,2,3,4,5
    
    //public static void main(String[] args) {
      //  int[] myArr={1,2,3,4,5};
/*
        int sum=0;
        for (int i : myArr) {
            sum=sum+i;

        }
        System.out.println(sum);    
        
    }
        */

        static int printArr(int [] arr){
            int sum =0;
            for (int i : arr) {
                sum=sum+i;
            }
            return sum;
         }
                    public static void main(String[] args) {
                        int[] myArr = {1,2,3,4,5};
                        int sum=printArr(myArr);
                        System.out.println(sum);
                        
                       
                    }
                      

//print an array in reverse order:5,4,3,2,1 - run for loop in opp direction ,eg i=5

 /*for (int i = myArr.length-1;i >= 0 ; i--){
    System.out.println(myArr[i]);
}
    }
    */

}
