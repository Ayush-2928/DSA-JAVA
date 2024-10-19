package Week11;

public class LL_Utility {
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addFirst(40);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(50);
       // System.out.println(ll.head.data);
        ll.addAtIndex(30, 2);
        ll.display();;
       System.out.println(ll.getNode(3).data); 
       ll.removeFirst();
       ll.removeLast();
       ll.display();
    }

    
}
