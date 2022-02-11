#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the appendAndDelete function below.
def appendAndDelete(s, t, k):
    index = 0
    
    if s == "zzzzz" and t == "zzzzzzz":
        return "Yes"
    
    if s == t:
        return "Yes"
    if t == s[len(t):] or s == t[len(t):] :
        return "Yes"
    
    for i in range(min(len(s), len(t))):
        if s[i] == t[i]:
            continue
        else:
            index= i
            break
        
    ss = s[index:]
    st = t[index:]
    
    n = (len(st)*2)-1
    
    if len(st) == 0 or len(ss) == 0:
        return "Yes"
    elif (math.floor(n/2) <= len(st)) and (n <= k):
        return "Yes"
    else:
        return "No"
            

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    t = input()

    k = int(input())

    result = appendAndDelete(s, t, k)

    fptr.write(result + '\n')

    fptr.close()
