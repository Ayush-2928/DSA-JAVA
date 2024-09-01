package Week7;

public class implementation {
    //wrapper class
    public static void main(String[] args) {
        Batch bt=new Batch();//call wrapper class 
        System.out.println(bt.num);
        
       Integer a1=10;//wrapper has the features of primitive datatype with added functions
       Integer a2=128;//false at 128+,true at 127 or less
       Integer a3=128;
       System.out.println(a1 + " " + a2 + " " + a3);
       String s1=new String("ji");
        s1="hey";//strinh interning
        System.out.println(s1);
       System.out.println(a2==a3);
    }
}
