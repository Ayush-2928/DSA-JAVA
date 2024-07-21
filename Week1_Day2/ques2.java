package Week1_Day2;
//create a swap function to swap 2 values inside an array
public class ques2 {

   /*  static void swap(int [] arr, int i, int j){
        // extra method to swap 2 nos
   int temp;
       while (i<j) {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
           
for (int k = 0; k < arr.length; k++) {
    System.out.println(arr[k]);
}
    
}

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr, 2, 3);
       
        
        
    }
         */
        //teachers method to swap 2 nos in array
   /*  static void swap(int [] arr, int i, int j){
    int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
   
}

public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    swap(arr, 2, 3);    
}
     */
    static void swap(int [] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }

    static void reverseUsingSwap(int [] arr ){
for (int i = 0 ,j=arr.length-1; i<j;i++,j--) {
    swap(arr, i, j);
  
    
}  printArr(arr);
    }
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+ " ");
            }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
      
    reverseUsingSwap(arr);
}
}
     
