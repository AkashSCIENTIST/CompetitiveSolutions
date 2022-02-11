#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the findDigits function below.
def findDigits(n):
    s = str(n)
    nn = 0
    for i in s:
        if int(i) == 0:
            continue
        elif n % int(i) == 0:
            nn += 1
        else :
            continue
    return nn
            

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        result = findDigits(n)

        fptr.write(str(result) + '\n')

    fptr.close()
