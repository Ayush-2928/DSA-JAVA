package Week1;
//check if a no is armstrong or not.
//doubt
import java.util.*;
public class example6 {
    static int digits(int n){
        int count=0;
        while (n!=0) {
        n/=10;
        count++; 
        }
        return count;
    }
    static boolean armstrong(int n){
        int d=digits(n);
        int sum=0;
        int temp=n;
        while (n!=0) {
            sum+=Math.pow(n%10, d);
            n/=10;
        }
        return (sum==temp);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrong(n));
    }
}
