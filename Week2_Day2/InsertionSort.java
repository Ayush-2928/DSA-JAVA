package Week2_Day2;

import java.util.*;

//import java.util.Arrays;
public class InsertionSort {
    
    static void insertionSort(int arr[]){
        int n=arr.length; //not used
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
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
        System.out.print("Sorted Array: ");
        insertionSort(arr);
        display(arr);
    
    }
    

}
