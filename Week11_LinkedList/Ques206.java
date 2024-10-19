// package Week11_LinkedList;

// public class Ques206 {
//     /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseList(ListNode head) {
//     return rev(head,null);
//     }

//     public ListNode rev(ListNode curr,ListNode prev){
//         if(curr==null)
//         return prev;
//         ListNode temp=rev(curr.next,curr);
//         curr.next=prev;
//         return temp;
//     }
// }
// }
