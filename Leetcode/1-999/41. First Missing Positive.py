class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = (i for i in nums if i>0)
        nums = list(set(nums))
        nums.sort()
        n = len(nums)
        i = 0
        if nums == []:
            return 1
        while (nums[i] == i+1):
            i += 1
            if i == n:
                return i+1
        else:
            return i+1
