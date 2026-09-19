class Solution:
    def splitArray(self, nums: List[int], k: int) -> int:
        left = max(nums)
        right = sum(nums)
        while left<right:
            mid = left + (right-left)//2
            count = 1
            currentsum = 0
            for i in nums:
                if currentsum + i>mid:
                    count += 1
                    currentsum = i
                else:
                    currentsum += i
            if count > k:
                left = mid + 1
            else :
                right = mid
        return left
        