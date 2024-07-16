package DAY2;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        //print all natural nos upto 10
       int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        while(i<=10){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
