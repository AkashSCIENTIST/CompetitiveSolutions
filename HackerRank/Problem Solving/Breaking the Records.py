#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the breakingRecords function below.
def breakingRecords(scores):
    mx, mn = scores[0] , scores[0]
    mmx, mmn = 0, 0
    for i in range(1, len(scores)) :
        if scores[i] < mn:
            mn = scores[i]
            mmn += 1
        if scores[i] > mx:
            mx = scores[i]
            mmx += 1
    return [mmx, mmn]
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    scores = list(map(int, input().rstrip().split()))

    result = breakingRecords(scores)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
