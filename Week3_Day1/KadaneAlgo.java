package Week3_Day1;

//best time complexity
public class KadaneAlgo {
    static int maxSubArray(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i =0;i<arr.length;i++){
           currentSum+=arr[i];
           maxSum=Math.max(maxSum,currentSum);
           if (currentSum<0) {
            currentSum=0;
           }
        }
     return maxSum;
    }
public static void main(String[] args) {
    int[] arr={2,1,-1,5,3};
    System.out.println(maxSubArray(arr));

}       
}



