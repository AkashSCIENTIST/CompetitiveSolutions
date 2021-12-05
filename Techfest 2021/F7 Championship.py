from itertools import permutations as p
n = 0

def fun(arr):
    arr2 = [i+arr[i] for i in range(n)]
    return arr2.count(max(arr2))

n = int(input())
arr = []
for i in range(n):
    num = int(input())
    arr.append(num)
    
all = p(arr)
vals = list(map(fun, all))

print(m)
