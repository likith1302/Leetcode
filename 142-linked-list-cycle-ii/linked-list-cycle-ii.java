/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                slow=head;//we need to start for head ans chech where it again meets fast that is starting point 
             while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
             }  
             return slow;
            }
        }
        return  null;
    }
}