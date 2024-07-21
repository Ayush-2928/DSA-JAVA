package Week1_Day2;
// reverse the array
//imp question
public class question {         

    static void revArr(int [] arr){
int [] temp = new int[arr.length];
for(int i=0; i<arr.length;i++)
    temp[i] = arr[arr.length-1-i];
//shallow copy
//arr=temp;
//printArr(temp);
//deep copy
for (int i = 0; i < arr.length; i++) {
    arr[i] = temp[i];
}
    }

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+ " ");
            }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        revArr(arr);
        printArr(arr);
        
        
    }
    
}
