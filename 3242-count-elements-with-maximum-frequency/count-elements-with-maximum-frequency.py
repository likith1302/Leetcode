class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        freq = {}
        for num in nums:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1

        max_freq = 0
        for count in freq.values():
            if count > max_freq:
                max_freq = count

        result = 0
        for count in freq.values():
            if count == max_freq:
                result += count

        return result