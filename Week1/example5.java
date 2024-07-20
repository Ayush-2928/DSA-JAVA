package Week1;
import java.util.Scanner;
public class example5 {
    //return the no of digits in a no.n=1234.output 4
    static int digits(int n){
int temp=0;
while (n!=0) {
n/=10;
temp++; 
}
return temp;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt(); 
        System.out.println(digits(n));
        sc.close();
    }
}
