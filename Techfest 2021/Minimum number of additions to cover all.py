def fun(i, n):
    if(i <= 0):
        return 1
    elif (i >= n):
        return n
    else:
        return i

n = int(input())
m = int(input())
k = int(input())
arr = []
for i in range(m):
    arr.append(int(input()))
nums = set((fun(i,n) for x in arr for i in range(x-k, x+k+1)))
print(n - len(nums))
