# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        s,f=head,head
        while f and f.next !=None:
            s=s.next
            f=f.next.next
        prev,cur=None,s.next
        s.next=None
        while cur:
            next_node=cur.next
            cur.next=prev
            prev=cur
            cur=next_node
        first,second=head,prev
        while  first and second:
            temp1,temp2=first.next,second.next
            first.next=second
            second.next=temp1
            first,second=temp1,temp2
