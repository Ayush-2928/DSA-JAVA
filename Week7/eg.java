package Week7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class eg {
    //create a function to find the max sum subarray of size k
    //(30,30,30,10,20,1,40,40)//k=2
    public static void main(String[] args) {
        int [] arr={30,30,30,10,20,1,40,40};
        findSubArray(arr, 2);
        
    }

    static ArrayList<Integer> findSubArray(int [] arr, int k ){
        ArrayList<Integer> nums=new ArrayList<>();
        ArrayList<Integer> nums_ans=new ArrayList<>();
        int start=0;
        int end =k-1;
        int maxsum=0;
        for (int i = 0; i <= end; i++) {
            maxsum+=arr[i];
            int currSum=maxsum;
            int index=0;
            while (end<arr.length-1) {
                currSum-=arr[start];
                start++;
                end++;
                currSum+=arr[end];
                if (maxsum<currSum) {
                    index=start;

                }
            }
        }
    
}
}
