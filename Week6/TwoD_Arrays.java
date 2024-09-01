package Week6;

import java.util.*;

public class TwoD_Arrays {

    static void populate(int [][] nums){
        int n=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {//nums[0] tells the no of elements in 1st row which is same for all the other rows
                nums[i][j]=n;
                n++;
            }
        }
    }

    static void display(int [][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sum (int [][] nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum+=nums[i][j];
            }
        }
        System.out.println(sum);
    }
//linear search
    static int[] search (int [][] nums, int n){
        int [] ans=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j]==n) {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    static void transpose(int [][] nums){
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums[0].length; j++) {
                temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        display(nums);
    }
    //sorting by  rows
    static void sortbyrow(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        display(arr);
        
    }
    //sort by columns 
    static void sortbycolmns(int [][] arr){
        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        display(arr);
    }

    //whole array sort
    static void sortwhole(int [][] arr){
        int [] flat=flaten(arr);
        Arrays.sort(flat);
        fillArray(arr, flat);
        
    }
   
    static int [] flaten(int [][] arr){
        int rows=arr.length;
        int columns=arr[0].length;
        int [] flat=new int[arr.length*arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flat[columns*i + j]=arr[i][j];
            }
        }
        return flat;
    }
    static void fillArray(int [][] arr, int [] flat){
        int columns=arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=flat[columns*i + j];
            }
        }
        display(arr);
        
    }

    public static void main(String[] args) {
        int [][] nums=new int [3][3];//initialise 2d array
        int [][] arr={{2,5,3},{1,4,6},{9,7,8}};
        populate(nums);
        display(nums);
        System.out.println();
        sortbyrow(arr);
        System.out.println();
        sortbycolmns(arr);
        System.out.println();
        sortwhole(arr);
        sum(nums);
      //  int [] indices=search(nums, 9); //for linear search
      // System.out.println("i :" + indices[0] + `" j :" + indices [1]);
      //  transpose(nums);

    //  int []arr= new int[5];//1d array
    //  int [] arr={1,2,3,4}; //another way for 1d array
    //  for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    //  }
    //  System.out.println(nums[0][1]);// 0th index and 1st index of that row
    //  System.out.println(nums[1]);//address of 1st index
    //    int [][] num={{1,2,3,4},
    //                 {5,6,7,8},
    //                 {9,10,11,12}};
    //    System.out.println(num[2][1]); //print 1st element of 0th row
       
    }
}
