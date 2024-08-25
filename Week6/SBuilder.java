package Week6;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        System.out.println(sb);
        sb.append("hey");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
