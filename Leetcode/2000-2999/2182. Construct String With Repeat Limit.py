from collections import Counter

class Solution:
    def repeatLimitedString(self, s: str, repeatLimit: int) -> str:
        d = Counter(s)
        q = [(i, d[i]) for i in d]
        fun = lambda x : (x[0], x[1])
        q = sorted(q, key=fun)
        # print(q)
        res = ""
        
        while len(q):
            char,freq = q.pop()
            res += char * min(freq, repeatLimit)
            
            if freq-repeatLimit > 0:
                if len(q) == 0:
                    return res
                else:
                    char2, freq2 = q.pop()
                    res += char2
                    q.append((char, freq-repeatLimit))
                    if len(q) == 0:
                        return res
                    elif freq2 > 1:
                        q.append((char2, freq2-1))
                    q = sorted(q, key=fun)
        else:
            return res
        
