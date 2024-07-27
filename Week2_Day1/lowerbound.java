package Week2_Day1;

public class lowerbound {
    static int lowerBound (int arr[], int num){
        int low =0 ; 
        int high = arr.length-1;
        int mid=0;
        int fo=-1;//first occurance
        while (low<=high) {
            mid=(low+high)/2;
            if (arr[mid]== num){ 
                fo=mid;
                high = mid-1;
            }
              else if (arr[mid] <num){
                low=mid+1;
              }       
            else
            high=mid -1;
        }
        return fo;

    }

    public static void main(String[] args) {
        int[] arr={1,2,5,5,5,5,7,8,9};
         System.out.println(lowerBound(arr, 5));
    }   
}
