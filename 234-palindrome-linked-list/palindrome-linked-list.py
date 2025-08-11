# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        s,f=head,head
        while f and f.next!=None:
            s=s.next
            f=f.next.next
        prev=None
        curr=s
        while curr is not None:
            next_node=curr.next
            curr.next=prev
            prev=curr
            curr=next_node
        l1=head
        l2=prev
        while l2:
            if l1.val != l2.val:
                return False
            else:
                l1=l1.next
                l2=l2.next
        return True

        