package Week3_Day2;

public class TimeComplexity {
     //and space complexity
     public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <=n; i++) {       //n
            for (int j = 0; j <=n; j+=i) //logn
                System.out.println("Hi");
            
            //time comp- n(logn)
        } 
//code 2
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i*i; j++) {
                for(int k=1;k<=n/2;k++);
                System.out.println("hi");
            }
            //time complexity- n^4
        }
     
     //code 3
     for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
         
            System.out.println("hi");
        }
        //time complexity- n^2
    }
 }

}
