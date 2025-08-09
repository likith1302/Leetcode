class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        result = []
        seen = set()
        for j in range(len(nums) - 3):
            if j > 0 and nums[j] == nums[j - 1]:
                continue
            for i in range(j + 1, len(nums) - 2):
                if i > j + 1 and nums[i] == nums[i - 1]:
                    continue
                l, r = i + 1, len(nums) - 1
                while l < r:
                    s = nums[j] + nums[i] + nums[l] + nums[r]
                    if s == target:
                        ans = [nums[j], nums[i], nums[l], nums[r]]
                        t = tuple(ans)
                        if t not in seen:
                            result.append(ans)
                            seen.add(t)
                        l += 1
                        r -= 1
                        while l < r and nums[l] == nums[l - 1]:
                            l += 1
                        while l < r and nums[r] == nums[r + 1]:
                            r -= 1
                    elif s < target:
                        l += 1
                    else:
                        r -= 1
        return result