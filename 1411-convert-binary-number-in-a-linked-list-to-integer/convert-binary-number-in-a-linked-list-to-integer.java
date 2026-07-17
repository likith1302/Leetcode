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
    public int getDecimalValue(ListNode head) {
        int res=0;
        ListNode cur=head;
        int i=0;
        while(cur!=null){
           res=2*res+cur.val;
           cur=cur.next;
           i++;

        }
        return res;
    }
}