package Week8;

import Week5.string;

public class recursion2 {
    public static void main(String[] args) {
       // System.out.println(fibonacciSeries(5));
       // generate_subsequences("Car", "");
       System.out.println(countSubSequence("Car"));
       // head_tail(2, "");
      //  System.out.println(countHeadTail(3));

       
    }

    static int fibonacciSeries(int n){
        if (n==0||n==1) {//in this the series index starts from 0
            return n;
        }
        int x=fibonacciSeries(n-1)+ fibonacciSeries(n-2);
        return x;
    }

    static void generate_subsequences(String ques,String ans){
        if (ques.length()==0) {
            System.out.println(ans);
            return;
        }
        generate_subsequences(ques.substring(1), ans + ques.charAt(0));
        generate_subsequences(ques.substring(1), ans);
    }

    static int countSubSequence(String ques){
        if (ques.length()==0) {
            return 1;
        }
        int x=2*countSubSequence(ques.substring(1));
        return x;
    }

    static void head_tail(int n,String ans){
        if (n==0) {
            System.out.println(ans);
            return;
        }
        head_tail(n-1, ans+"H");
        head_tail(n-1, ans.concat("T"));//diff ways to write both
    }
    static int countHeadTail(int n){
        if (n==0||n==1) {
            return 2*n;
        }
        int x=2*countHeadTail(n-1) ;
        return x;
    }
//generate valid parenthesis 
    static void parenthesis (int n,String ans){
        
    }

    }

