#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the utopianTree function below.
def utopianTree(n):
    h = 1
    hh = [1]
    temp = []
    for i in range(1, n+1):
        if i%2 == 0:
            h += 1
            hh.append(h)
        if i%2 == 1:
            h *= 2
            hh.append(h)
    return hh[n]
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = utopianTree(n)

        fptr.write(str(result) + '\n')

    fptr.close()
