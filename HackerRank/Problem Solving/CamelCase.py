#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the camelcase function below.
def camelcase(s):
    x = 1
    #ss = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for i in s:
        if i.isupper():
            x += 1
    return x

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = camelcase(s)

    fptr.write(str(result) + '\n')

    fptr.close()
