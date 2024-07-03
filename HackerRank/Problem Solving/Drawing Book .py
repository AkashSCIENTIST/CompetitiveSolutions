#!/bin/python3

import os
import sys

#
# Complete the pageCount function below.
#
def pageCount(n, p):
    if (p==1) or (n == p) or (isodd(n) and n-p == 1):
        return 0
    if p in [2, 3, n-1, n-2]:
        return 1
    t = []
    temp = [x for x in range(1, n+1)]
    if n%2 == 1:
        pass
    else:
        temp[-1] = 0
    temp = [0] + temp
    
    nn = temp.index(p)//2
    t.append(nn)
    nn = temp.index(n - p)//2
    t.append(nn)
    
    return min(t)

def isodd(n):
    if n%2 ==1:
        return True
    else :
        return False

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    p = int(input())

    result = pageCount(n, p)

    fptr.write(str(result) + '\n')

    fptr.close()
