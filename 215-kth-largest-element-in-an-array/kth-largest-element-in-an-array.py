class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        max_heap=[-x for x in nums]
        heapq.heapify(max_heap)
        count=0
        while count<k-1:
            heapq.heappop(max_heap)
            count+=1
        return -heapq.heappop(max_heap)

        