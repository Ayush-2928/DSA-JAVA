package Week11_Stack;

import java.util.Stack;

public class Stackk_RecurApproach {
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        insertAtFirst(stk, 5);
        System.out.println(stk);
        rev(stk);
        System.out.println(stk);
        
    }

        static void insertAtFirst(Stack<Integer> stk,int element){
            if (stk.isEmpty()) {
                stk.push(element);
            } else {
                // Store the top element and pop it
                int top = stk.pop();
                // Recur for the remaining stack
                insertAtFirst(stk, element);
                // Push the top element back
                stk.push(top);
                
            }
           
        }

        static void rev(Stack<Integer> stk){
            if (stk.empty()) {
                return;
            }
            int x=stk.pop();
            rev(stk);
            insertAtFirst(stk, x);
        }


}
//2395 hw