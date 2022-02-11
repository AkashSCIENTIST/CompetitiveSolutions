#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.
def repeatedString(s, n):
    if len(s) == 1 and s == "a":
        return n
    if len(s) == 1 and s != "a":
        return 0
    if len(s) >= n:
        return s[:n].count("a")
        
    nn = s.count("a") * math.floor(n/len(s))
    nn += s[:n%len(s)].count("a")
    return nn


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
