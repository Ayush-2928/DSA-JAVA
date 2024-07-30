package Week2_Day2;

public class SelectionSort {
    
    static void selectionSort(int [] arr ){
        for(int i =0; i <arr.length-1;i++){
            int idx = minimumvalue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]= temp;
        }
    }

    static int minimumvalue(int [] arr,int a){
        int mini = a;
        for (int i = a+1; i < arr.length; i++)
        if (arr[mini]>arr[i]) 
            mini =i;
        
            return mini;
        
    }
    static void display(int [] arr){

        for (int i : arr) {
            System.out.print(i + " ");
            
        }
    }

    public static void main(String[] args) {
        int [] arr={10,4,3,8,9,7,6};
        System.out.print("Original Array: ");
        display(arr);
        System.out.println();
        System.out.print("Sorted Array: ");
        selectionSort(arr);
        display(arr);
    
    }
}
