package Week5;

public class Ques1 {
    //Q1 function to reverse a string
    
   
   
    
    
    //Ques1
    // static String reverse(String s1){
    //     String s2="";
    //     for (int i = s1.length()-1; i >=0; i--) {
    //         s2=s2+ s1.charAt(i);
    //      }
    // }
    public static void main(String[] args) {
        String s1="potato";
        String s2= "";
        for (int i = s1.length()-1; i >=0; i--) {
           s2=s2+ s1.charAt(i);
        }
        System.out.println(s2);
    }

 

   
}
