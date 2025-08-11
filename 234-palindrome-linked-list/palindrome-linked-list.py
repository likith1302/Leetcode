class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # Step 1: Find middle
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # Step 2: Reverse second half
        prev = None
        while slow:
            slow.next, prev, slow = prev, slow, slow.next

        # Step 3: Compare halves
        while prev:
            if head.val != prev.val:
                return False
            head = head.next
            prev = prev.next
        return True

