package Week1;
//check if a no is armstrong or not.
//doubt
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
        System.out.println(armstrong(1));
    }
}
