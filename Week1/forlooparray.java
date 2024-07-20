package Week1;

public class forlooparray {
 static void printArr(int [] arr){
//for each loop
for (int i : arr) 
System.out.println(i+ " ");
System.out.println();
    
}
public static void main(String[] args) {
    int[] myArr = {1,2,3,4,5};
    printArr(myArr);
}

 }   

