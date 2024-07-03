#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    #print(a)
    x = []
    t = 0
    #print(list(range(max(a), min(a)-1)))
    for i in range(max(a),min(a)-1, -1):
        #print(i)
        t = a.count(i) + a.count(i-1)
        x.append(t)
        #print(x)
        
    return max(x)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()
