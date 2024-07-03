import sys
sys.setrecursionlimit(2**20)

def cross(n):
    s = list("abcdefghijklmnopqrstuvwxyz")
    if n == 1:
        return s
    res = [sub1 + sub2 for sub1 in s for sub2 in s]
    if n == 2:
        return res
    else:
        for i in range(n-2):
            temp = [sub1 + sub2 for sub1 in s for sub2 in res]
            res = temp
            temp = []
        return res

    
n, k, m = map(int, input().split(" "))
mod_ = 2 ** m
arr = cross(n)


def hash(s:str, m:int) -> int:
    if len(s) == 0:
        return 0
    elif len(s) == 1:
        return (ord(s[-1]) - ord('a') + 1)
    else:
        h = ((hash(s[:-1], m) * 33) ^ (ord(s[-1]) - ord('a') + 1)) % m
        return h
 
total = 0
for i in arr:
    if hash(i, mod_) == k:
        total += 1
        
print(total)
