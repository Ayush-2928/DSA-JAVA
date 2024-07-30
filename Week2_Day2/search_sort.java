package Week2_Day2;

import java.util.Arrays;

public class search_sort {
    static void display(int [] arr){

        for (int i : arr) {
            System.out.print(i + " ");
              
        }
    }
    public static void main(String[] args) {
        int [] arr={10,4,3,8,9,7,6};
        System.out.print("Original Array: ");
        display(arr);
        System.out.println();
        
        Arrays.sort(arr);
       System.out.println(Arrays.binarySearch(arr, 8));
       
        display(arr);
    
    }
    
}
