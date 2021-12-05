from itertools import combinations as c

def totalWays(n, k):
    # Write your code here.
    arr = tuple(range(n))
    arr2 = tuple(c(arr, k))
    return len(arr2)+1
