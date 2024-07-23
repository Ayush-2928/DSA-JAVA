package Week1_Day2;
//create a function to search for an element n in an array
public class linear_searching {
    static boolean linearSeach(int [] arr, int n){

        for (int i : arr) 
            if (i==n) 
                return true;
            return false;
            
    }

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+ " ");
            }

public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    
    System.out.println(linearSeach(arr, 6));
    printArr(arr);
    
    
}
}
