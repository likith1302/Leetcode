# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        dummy=ListNode(0)
        dummy.next=head
        left_prev=dummy
        cur=head
        for _ in range(left-1):
            left_prev=left_prev.next
            cur=cur.next
        prv=None
        tail=cur
        for _ in range(right-left+1):
            next_node=cur.next
            cur.next=prv
            prv=cur
            cur=next_node
        left_prev.next=prv
        tail.next=cur
        return dummy.next


        