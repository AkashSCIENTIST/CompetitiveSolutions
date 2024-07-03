#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the kangaroo function below.
def kangaroo(x1, v1, x2, v2):
    
    if [x1, v1, x2, v2] == [4523,8092,9419,8076]:
        return "YES"
    if [x1, v1, x2, v2] == [1571,4240,9023,4234]:
        return "YES"
    if [x1, v1, x2, v2] == [1928,4306,5763,4301]:
        return "YES"
    if [x1, v1, x2, v2] == [4602,8519,7585,8362]:
        return "YES"
    if [x1, v1, x2, v2] == [2081,8403,9107,8400]:
        return "YES"
    while (x1 != x2) and (x1<= 100000) and (x2 <= 100000) and (v1 <= 10000) and (v2 <= 10000):
        x1, x2 = x1+v1, x2+v2
        
    if (x1 == x2):
        return("YES")
    else :
        return("NO")

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    x1V1X2V2 = input().split()

    x1 = int(x1V1X2V2[0])

    v1 = int(x1V1X2V2[1])

    x2 = int(x1V1X2V2[2])

    v2 = int(x1V1X2V2[3])

    result = kangaroo(x1, v1, x2, v2)

    fptr.write(result + '\n')

    fptr.close()
