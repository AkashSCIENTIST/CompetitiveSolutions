#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the plusMinus function below.
def plusMinus(arr):
    nn = len(arr)
    p, z, n = 0, 0, 0
    for i in arr:
        if i == 0:
            z += 1
        elif i < 0 :
            n += 1
        elif i > 0:
            p += 1
        else:
            pass
    print(p/nn)
    print(n/nn)
    print(z/nn)

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
