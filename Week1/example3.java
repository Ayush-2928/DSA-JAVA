package Week1;



import java.util.*;
public class example3 {
    //prime or not 
    static boolean checkPrime (int n){
              for (int i = 2; i < n; i++) 
                if (n%i==0) return false;
                    
                   return true;                                             
                            
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
           
            if (checkPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
            
        }
    }


