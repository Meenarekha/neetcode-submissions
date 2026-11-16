class Solution:
    def findMin(self, nums: List[int]) -> int:
        n = len(nums)
        minimum = nums[0]

        for n in nums:
            if n<minimum:
                minimum = n
        return minimum