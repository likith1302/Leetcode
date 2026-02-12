/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode big=new ListNode(0);
        ListNode s=small;
        ListNode b=big;
        while(head!=null){
            if(head.val<x){
             s.next=head;
             s=s.next;
            }
            if(head.val>=x){
                b.next=head;
                b=b.next;
            }
            head=head.next;
        }
        b.next=null;
        s.next=big.next;
        return small.next;
    }
}