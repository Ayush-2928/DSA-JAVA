package Week5;

public class Ques2 {
    //Q2 Function to check if a string is a pallindrome or not
    
    public static void main(String[] args) {
        String s1="aba";
        String s2="";
        for (int i =s1.length()-1; i >=0; i--) 
            s2+=s1.charAt(i);
            System.out.println(s1==s2.intern());
            
            
        }
    }

