package Week1;

public class example3 {
    //prime or not 
    static boolean checkPrime (int n){
              for (int i = 2; i < n; i++) 
                if (n%i==0) return false;
                    
                   return true;                                             
                            
        }
        public static void main(String[] args) {
            int n=2;
           
            System.out.println(checkPrime(n));
            
        }
    }


