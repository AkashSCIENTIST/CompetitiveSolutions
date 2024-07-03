#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the migratoryBirds function below.
def migratoryBirds(arr):
    d = {}
    max_ = 0
    a = []
    for i in arr:
        if i in d.keys():
            d[i] += 1
        else :
            d[i] = 1
    for i in d:
        if d[i] >= max_:
            max_ = d[i]
    print(max_)
    for i in list(d.keys()):
        if (d[i] == max_):
            a.append(i)
            
    print(d)
    return min(a)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = migratoryBirds(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
