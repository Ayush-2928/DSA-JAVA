package Week5;
 //q5 function to reverse the words of a string 
public class Ques5 {
    public static void main(String[] args) {
        String s="? You are nigga";
        String [] arr=s.split("\\s");
        for (int i = arr.length-1; i>=0; i--) 
           System.out.print(arr[i] + " ");
        
    }    
    
}
