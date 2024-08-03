package Week3_Day1;

public class RotateArray {
 //leet ques 189   
public static void main(String[] args) {
    int[] nums={1,2,3,4,5,6,7};
    for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i] + " ");
    }

rotateNum(nums, 3);

}   
static void rotateNum(int[] nums,int k){
   
    int temp= nums[nums.length-1];
for (int i = nums.length-1; i >0; i--) {
    nums[i]=nums[i-1];
    
}
nums[0]=temp;

for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i] + " ");
}
}

}

//leetcode code 1
/*
 class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        for(int i=0;i<k;i++)
        rotateOne(nums);

    }
    public void rotateOne(int[] nums){
        int temp= nums[nums.length-1];
    for (int i = nums.length-1; i >0; i--) {
    nums[i]=nums[i-1];
    
}
nums[0]=temp;
    }
}
 */

 //leet code 2
 /*
  class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int n=nums.length;
        int[] temp=new int[nums.length];

        for(int i=0;i<n-k;i++)
        temp[i+k]=nums[i];
        for(int j=0;j<k;j++)
        temp[j]=nums[n-k+j];
        //deep copy
        for(int i=0;i<n;i++)
        nums[i]=temp[i];
    }
}
  */