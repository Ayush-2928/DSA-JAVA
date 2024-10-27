package Week11_Stack;

import java.util.Stack;

public class Stack_Practice {
    public static void main(String[] args) {
       
    Stack <Integer> stk1=new Stack<>();
    Stack <Integer> stk2=new Stack<>();
    stk1.push(1);
    stk1.push(2);
    stk1.push(3);
    stk1.push(4);
    System.out.println(stk1);
    while(!stk1.empty()){
        populate_delete(stk1.pop(),stk2);
    }
    System.out.println(stk2);
    }

static void populate_delete(int n,Stack<Integer> stk2){
    stk2.push(n);
}
}
