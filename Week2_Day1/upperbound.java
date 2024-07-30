package Week2_Day1;

public class upperbound {
    //in upperbound we take the next value of the required num
    // in lowerbound we take the first occurance of the number and return it
    static int upperBound (int arr[], int num){
        int low =0 ; 
        int high = arr.length-1;
        int mid=0;
        int ans=-1;
        while (low<=high) {
            mid=(low+high)/2;
            if (arr[mid]== num){ 
                ans=mid+1;
                low = mid +1;
            }
              else if (arr[mid] <num){
                low=mid+1;
              }     
                
            else
            high=mid -1;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr={1,2,5,5,5,5,7,8,9};
         System.out.println(upperBound(arr, 8));
    }   
}
