package DAY2;
//doubt
public class star5 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >=1 ; i--) {
            //for space
            for (int k = 1; k <=n-i; k++) {
                
                System.out.print(" ");
           
            }
            //for star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
