package Week11_LinkedList;

public class LinkedList {
    class Node{
        int data;
        Node next;
   }
    Node head;
   private Node tail;
   private int size;

   public void addFirst(int item){
    Node nn=new Node();
    nn.data= item;
    if (size==0) {
        head=nn;
        tail=nn;
        
    }else {
        nn.next=head;
        head=nn; 
        
    }
    size++;
   }

   public void display(){
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data + "-->");
        temp=temp.next;
            
    }
    System.out.println("NULL");
   }


   public void addLast(int item){
    if (size==0) {
        addFirst(item);
    }
    else{
        Node nn=new Node();
        nn.data=item;
        tail.next=nn;
        tail=nn;
    }
    size++;
   }
   public Node getNode(int index){
   Node temp=head;
    for (int i = 0; i < index; i++) 
        temp=temp.next;
    return temp;
   }

   public void addAtIndex(int item,int index){
    if (index==0) {
        addFirst(item);
    }
    else if (index==size-1) {
        addLast(item);
    }
    else{
        Node nn=new Node();
        nn.data=item;
        Node k_1th=getNode(index-1);
        nn.next=k_1th.next;
        k_1th.next=nn;
    }
   }

   public int getFirst(){
    return head.data;
   }

   public int getLast(){
    return tail.data;
   }

   public int getIndex(int k){
    if (k<0 || k>=size) {
        return -1;
    }
    else if (k==0) {
        return getFirst();
    }
    else if (k==size-1) {
        return getLast();
    }
    else {
       return getNode(k).data;
    }
   }

   public int removeFirst(){
    int rv=head.data;
    if (size==1) {
        head=null;
        tail=null;
        
    }else{
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    size--;
    return rv;
   }

   public int removeLast(){
   
    if (size==1) {
        return removeFirst();
        
    }else{
        int rv=tail.data;
        Node secondLast=getNode(size-2);
        secondLast=null;
        tail=secondLast;
        size--;
        return rv;
    }
    
    
   }
}
