package Week6;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(10);
        sb.append("hello");
        sb.append("hey");
        sb.insert(3, "lllo");
        sb.delete(2, 6);
        sb.ensureCapacity(100);
        sb.append("bye");
        System.out.println(sb);
        sb.replace(2,5,"Replaced");
       // sb.reverse();
        System.out.println(sb);
      //  System.out.println(sb.capacity());
       // System.out.println(sb.length());
        //System.out.println(sb.substring(5));
        
    }
}
