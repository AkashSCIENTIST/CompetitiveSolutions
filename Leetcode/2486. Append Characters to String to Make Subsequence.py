class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        tptr,n = 0,len(t)

        for c in s:
            if c == t[tptr]:
                tptr += 1
                if(tptr == n):
                    return 0
        
        return n - tptr
        
