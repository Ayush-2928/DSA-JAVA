package Week2_Day1;
// given - soryet array
//crete function named count occurence
//tell the number of times avalue is repeating 
public class CountOccurence {
    
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

    static int upperBound (int arr[], int num){
        int low =0 ; 
        int high = arr.length-1;
        int mid=0;
        int ub=-1;
        while (low<=high) {
            mid=(low+high)/2;
            if (arr[mid]== num){ 
                ub=mid+1;//if doing last occ do lo= mid 
                low = mid +1;
            }
              else if (arr[mid] <num){
                low=mid+1;
              }       
            else
            high=mid -1;
        }
        return ub;

    }

    
    static int countOccurence( int arr[], int num ){
      int lb = lowerBound(arr, num);//condition for if the no is not in the array
      if (lb==-1) {
        return 0;
      }
      int ub=upperBound(arr, num);
      return ub-lb;

      // int count=0;
      // count=upperBound(arr, num) - lowerBound(arr, num);
        
       //  return count;
    }
    

    public static void main(String[] args) {
        int num = 5;
        int[] arr={1,2,5,5,5,5,7,8,9};

         System.out.println(countOccurence(arr, num));
    }   
}



