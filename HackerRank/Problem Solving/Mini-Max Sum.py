#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    temp, temp1 = list(arr), list(arr)
    t = 0 
    t1 = 0
    max_, min_ = 0, 0
    for i in range(len(arr)-1):
        t = max(temp)
        max_ += t
        temp.remove(t)
        t1 = min(temp1)
        temp1.remove(t1)
        min_ += t1
    print(min_, end = "")
    print(" ", end = "")
    print(max_)
        

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
