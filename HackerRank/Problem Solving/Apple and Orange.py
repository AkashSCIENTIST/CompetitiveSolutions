#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countApplesAndOranges function below.
def countApplesAndOranges(s, t, a, b, apples, oranges):
    home  = range(s, t+1)
    apple_range = [x+a for x in apples]
    orage_range = [x+b for x in oranges]
    a_n , m_n = 0, 0
    for i in apple_range:
        if i in home:
            a_n +=1
    for i in orage_range:
        if i in home:
            m_n += 1
            
    print(a_n)
    print(m_n)

if __name__ == '__main__':
    st = input().split()

    s = int(st[0])

    t = int(st[1])

    ab = input().split()

    a = int(ab[0])

    b = int(ab[1])

    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    apples = list(map(int, input().rstrip().split()))

    oranges = list(map(int, input().rstrip().split()))

    countApplesAndOranges(s, t, a, b, apples, oranges)
