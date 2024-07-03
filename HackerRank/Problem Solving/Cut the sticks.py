#!/bin/python3

#import math
import os
#import random
#import re
#import sys

# Complete the cutTheSticks function below.
def cutTheSticks(arr):
    temp = []
    temp.append(len(arr))
    while len(arr) > 0:
        print(arr)
        arr = ns(arr)
        temp.append(len(arr))
    del temp[-1]
    return temp
        
        
def ns(arr):
    n = min(arr)
    arr[:] = [i-n for i in arr]
    a = [x for x in arr if x != 0]
    return a
        
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = cutTheSticks(arr)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
