// package Week11_LinkedList;

// public class Ques141 {
//     /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode tort=head;
//         ListNode hare=head;
//         if(head==null || head.next ==null )
//         return false;
//         while(!(hare==null || hare.next==null)){
//             hare=hare.next.next;
//             tort=tort.next;
//             if(hare==tort)
//             return true;
//         }
//         return false;
//     }
// }
// }
