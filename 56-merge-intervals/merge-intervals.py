class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals)<=1:
            return intervals
        intervals.sort(key=lambda x:x[0])
        result=[intervals[0]]
        for cur in  intervals[1:]:
            last=result[-1]
            if cur[0]<=last[1]:
                last[1]=max(last[1],cur[1])
            else:
                result.append(cur)
        return result

