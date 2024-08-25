package Week5;

public class string {
    public static void main(String[] args) {
        // String s1="hello";
        // String s2=new String("hell");
        // String s3=s1;
        // String s4=new String(s1);
        // char[] c ={'h','e','l'};
        // String s5=new String(c);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(c);
        // System.out.println(s5);

         String s1="table";
        // String s2="table";
        // s1+="s";
        //  String s3=new String(s1);
        //  String s4=new String("table");
    //     System.out.println(s1);
    //     System.out.println(s2);
       // System.out.println(s1==s2);
        //  System.out.println(s1.length());
        //  System.out.println(s1.charAt(3));
          System.out.println(s1.substring(2)); 
          System.out.println(s1.substring(2,4));
       // System.out.println(s1.equals(s2));
    //     s1=s1.concat("BAA");
    //     System.out.println(s1);
    //     String s5=5+3+"ad"+2+3;
    //     s5+="qd11111111";
    //     System.out.println(s5);
    //     String s6="HEllo";
    //   //  s6=s6.trim();
    //     System.out.println(s6);
        
    
    
    //REGEX expressions
  /*  String s1="This\sis\sa\sclass";//for space
    System.out.println(s1);
    String s2="This\tis\ta\tclass";//for tab
    System.out.println(s2);
    String s3="This is line 1 \nThis is line 2";//new line
    System.out.println(s3);
    String s4="This  is\rFunny"; //return evrything after r to start
    System.out.println(s4);
    String s5="Girls\b rule  ";//backspace
    System.out.println(s5);
    String s6="Girls\frule ";//new page 
    System.out.println(s6);
    String s7="\"Hello\"";//double quote
    System.out.println(s7);
    char a ='\'';//single quote
    System.out.println(a);

 */

 //split function
//     String s1="this is string";
//     String[] arr=s1.split("\\s",2) ;
//     // for (int i = 0; i < arr.length; i++) {
//     //     System.out.println(arr[i])
//     // }
//    for (String string : arr) {
//     System.out.println(string);
//    }  

//String intern 
//intern keyword searches the word in string pool,so no new memory iscreated 
// String s1="hello";
// String s2=new String("hello").intern();
// String s3="hello";
// System.out.println(s1==s2);


        //valueOf
        // int n=5;
        // String s1=String.valueOf(n);
        // s1+="abc";
        // System.out.println(s1);
    }
}
