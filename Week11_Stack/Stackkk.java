package Week11_Stack;
import java.util.Stack;
public class Stackkk {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack <>();
        System.out.println(stk.empty());//check for empty
        stk.push(1);
        stk.push(2);
        stk.push(3);
       // stk.add(2);
        // System.out.println(stk.peek());//view item at top of stack without removing
        // System.out.println(stk.pop());//removes top element and returns it 
        System.out.println(stk.search(3));//index of that no in stack , index starts from 1
        System.out.println(stk.capacity());
        System.out.println(stk.size());

        //implement stacks using linked lists
    }
}
