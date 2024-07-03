class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left, right, mid, hours = 1, max(piles), None, None

        while left<right:
            mid = (left+right)//2
            hours = 0
            for i in piles:
                hours += math.ceil(i/mid)
            if hours <= h:
                right = mid
            else:
                left = mid+1
        return right
        
