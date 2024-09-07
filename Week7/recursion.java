package Week7;
//principal of mathematical induction-pmi
public class recursion {
    //example1
    public static void main(String[] args) {
        System.out.println(multiply(15, 10));
        System.out.println(factorial(19));
        System.out.println(fact(19, 1));
        System.out.println(power(3, 9));
        System.out.println(pow(3, 4, 1));
    }
 
   static int multiply(int a,int b){
        if (a==1) {
            return b;
        }
        int x=b+ multiply(a-1, b);//when it calls then the same function is run for 14,simplarly then 13 and so on 
        return x;
    }
    //head
    static int factorial(int n){
        if (n==0|| n==1) {
            return 1;
        }
        int x=n* factorial(n-1);
        return x;
    }
    //tail recursion factorial
    static int fact(int n,int x){
        if (n==0 || n==1) {
            return x;
        }
        return fact(n-1, n*x);
    }

    //head recursion
    static int power(int a,int b){
        if (b==0) {
            return 1;
        }
        int x=a*power(a, b-1);
        return x;
        
    
    }
    //or another method- tale recursion
    static int pow(int a,int b,int x){
        if (b==0) {
            return x;
        }
        return pow(a, b-1, a*x);
    }
}

