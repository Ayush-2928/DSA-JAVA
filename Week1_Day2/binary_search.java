package Week1_Day2;

public class binary_search {

/*
    static boolean binarySearch(int [] arr, int n, int i, int j){//take i,j for limiting the search area
     //   int i=0; 
       // int j= arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
           if (arr[mid]==n) {
            return true;
           } 
            else if (arr[mid]<n) 
                i=mid+1; 
                else j=mid-1;              
        }      
        
        return false;
    }

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+ " ");
            }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        System.out.println(binarySearch(arr, 3, 2,  4));
    }
        
}
   */  
static boolean binarySearch(int [] arr, int n){
     int i=0; 
     int j= arr.length-1;
       while (i<=j) {
           int mid=(i+j)/2;
          if (arr[mid]==n) {
           return true;
          } 
           else if (arr[mid]<n) 
               i=mid+1; 
               else j=mid-1;              
       }      
       
       return false;
   }

   static void printArr(int[] arr){
       for (int i = 0; i < arr.length; i++) 
           System.out.print(arr[i]+ " ");
           }
   public static void main(String[] args) {
       int[] arr={1,2,3,4,5};

       System.out.println(binarySearch(arr, 3));
   }
}
   
   

  

