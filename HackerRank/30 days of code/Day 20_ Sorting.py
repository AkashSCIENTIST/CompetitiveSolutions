#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    a = list(map(int, input().rstrip().split()))
    swaps = 0
    
    for i in range(n):
        for j in range(n-1):
            if(a[j] > a[j+1]):
                a[j], a[j+1] = a[j+1], a[j]
                swaps += 1
        if swaps == 0:
            break
        
    s = """Array is sorted in {} swaps.\nFirst Element: {}\nLast Element: {}""".format(swaps, a[0], a[-1])
    print(s)
