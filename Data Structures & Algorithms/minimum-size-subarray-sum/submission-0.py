class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left = 0
        total = 0
        minlen = float('inf')
        for right in range(len(nums)):
            total += nums[right]
            while total >= target:
                minlen= min(minlen, right-left +1)
                total -= nums[left]
                left += 1
        if minlen == float('inf'):
                return 0
        return minlen  