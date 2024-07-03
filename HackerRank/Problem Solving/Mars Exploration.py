#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the marsExploration function below.
def marsExploration(s):
    print(s)
    string = "SOS"
    n = len(s)//3
    ss = string * n
    x = 0
    for i in range(len(s)):
        if ss[i] != s[i]:
            x += 1
        else :
            pass
        
    return x

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = marsExploration(s)

    fptr.write(str(result) + '\n')

    fptr.close()
