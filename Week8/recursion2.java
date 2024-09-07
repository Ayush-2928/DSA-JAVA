package Week8;

import Week5.string;

public class recursion2 {
    public static void main(String[] args) {
       // System.out.println(fibonacciSeries(5));
       // generate_subsequences("Car", "");
        head_tail(2, "");
       
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

    static void head_tail(int n,String ans){
        if (n==0) {
            System.out.println(ans);
            return;
        }
        head_tail(n-1, ans+"H");
        head_tail(n-1, ans.concat("T"));//diff ways to write both
    }

    }


