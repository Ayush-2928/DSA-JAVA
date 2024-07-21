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
       /* */
        //using for loop
        static int printArr(int [] arr, int a, int b){
            if (a>b || a<0 || b<0 || b>= arr.length) {
                return 0;
            }
            int sum =0;
           
            for (int i = a; i <= b; i++) 
                sum+=arr[i];
            //using for each loop 
          //  for (int i : arr) {
            //    sum=sum+i;
           // }
            return sum;
         }
                    public static void main(String[] args) {
                      int   a=1;
         int   b=3;
                        int[] myArr = {1,2,3,4,5};
                        int sum=printArr(myArr,a,b);
                        System.out.println(sum);  
                        
                       
                    }
                      

//print an array in reverse order:5,4,3,2,1 - run for loop in opp direction ,eg i=5

 /*for (int i = myArr.length-1;i >= 0 ; i--){
    System.out.println(myArr[i]);
}
    }
    */

}
