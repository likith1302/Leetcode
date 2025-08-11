# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        c=head
        prv=None
        while(c!=None):
            next_node=c.next
            c.next=prv
            prv=c
            c=next_node
        return prv
        