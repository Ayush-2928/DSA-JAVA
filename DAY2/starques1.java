package DAY2;
// print 5 stars in a 5x5 square
public class starques1 {
    public static void main(String[] args) {
        int n=5;
        // n controls no of rows , j controls what will be printed inside 
        
        for (int i = 1; i <=n  ; i++) {
            for (int j = 1; j <=  n; j++) {
                System.out.print( "*" + " ");
                      
            }
            System.out.println();
        }

    }
}
