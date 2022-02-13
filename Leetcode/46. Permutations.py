class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1:
            return [nums]
        else:
            arr = []
            for i in range(len(nums)):
                n = nums[i]
                other = nums[:i] + nums[i+1:]
                temp = []
                for j in self.permute(other):
                    arr.append([n]+j)
            return arr
