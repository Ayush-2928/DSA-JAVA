package Week1;
//swap two numbers a,b
public class examples {
    /* static void swap(int a , int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b );
    }
    //create a new function
    public static void main(String[] args) {
        int a=10, b=15;
        swap(a,b);
        //this will not cause swap as original values are not shared
        //call by value - only shring the value without changing original
        System.out.println(a + " " + b );//this is call by value,only call by value is used in java 
    }
        */
//first n natural no
        static void naturalno(int n){
            for (int i = 1; i <=n ; i++) {
                System.out.print(i + " ");   
                System.out.println();             
            }

                    }
                    public static void main(String[] args) {
                        naturalno(5);
                        
                    }
                        
}
