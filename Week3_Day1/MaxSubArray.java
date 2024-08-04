package Week3_Day1;
//q53 sub array
public class MaxSubArray {
    //kadane algo is the best method for maxSUBARRAY
        //   int sum (int [] nums, int a,int b){
          //     int sum=0;
            //   for(int i =a;i<=b;i++)
              // sum+= nums[i];
              // return sum;
       
           //   }
           public int maxSubArray(int[] nums) {
               int maxSum=Integer.MIN_VALUE;
               for(int i =0;i<nums.length;i++){
                   int tempSum=0;
                   for(int j=i;j<nums.length;j++){
                       tempSum+=nums[j];
                 //  tempSum=sum(nums, i , j );
                   maxSum=Math.max(tempSum, maxSum); 
               }
            }
            return maxSum;
           }
          
       }
       
            

