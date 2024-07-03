class Solution:
    def isHappy(self, n: int) -> bool:
        if n == 1:
            return True
        slow = sum([int(c)**2 for c in str(n)])
        fast = sum([int(c)**2 for c in str(slow)])
        while fast != slow:
            slow = sum([int(c)**2 for c in str(slow)])
            fast = sum([int(c)**2 for c in str(fast)])
            fast = sum([int(c)**2 for c in str(fast)])
            
        return slow == 1
