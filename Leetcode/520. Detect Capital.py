class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        gen = (i.isupper() for i in word[1:])
        n = len(word)
        if n==1:
            return True
        status = 0
        for i in gen:
            if i:
                status += 1
        if not (status == n-1 or status == 0):
            return False
        else:
            if status==0:
                return True
            elif status==n-1 and word[0].isupper():
                return True
            else:
                return False
        
