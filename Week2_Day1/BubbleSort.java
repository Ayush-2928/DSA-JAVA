package Week2_Day1;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr){
        for (int turn = 1; turn < arr.length; turn++){
            for (int i = 0; i < arr.length - turn; i++) {

                if ( arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }          
        }           
    } 
    static void display (int [] arr){
   //using for each loop
        for(int i:arr )
    System.out.print(i + " ");
    //using for loop
    System.out.println();
    for(int i= 0;i<arr.length;i++)
    System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8,1};
        bubbleSort(arr);
        display(arr);
    }

}
