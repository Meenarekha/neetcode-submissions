class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        target = (n*(n+1))//2
        total = 0
        for i in nums:
            total += i
        return target-total