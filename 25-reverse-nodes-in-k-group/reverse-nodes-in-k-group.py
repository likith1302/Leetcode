# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
     def rev(head,k):
        temp=head
        count=0
        while count<k :
            if temp==None:
              return head
            count+=1
            temp=temp.next
        prev=rev(temp,k) 
        temp=head
        count=0
        while count<k:
           next_node=temp.next
           temp.next=prev
           prev=temp
           temp=next_node
           count+=1
        return prev
     return rev(head,k)

        

        