package Week1;
//return the inverse of a number n .n=1549.output=9451
public class example4 {
    static int inverse(int n){

    int temp=0;
    while (n!=0) {
        temp= temp*10  + n%10;
        n/=10;
        
    }
    return temp;


    }
    public static void main(String[] args) {
        int n=13040;
        System.out.println(inverse(n));
    }
    
}
