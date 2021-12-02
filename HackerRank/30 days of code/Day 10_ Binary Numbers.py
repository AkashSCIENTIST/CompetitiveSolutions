#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    s = ""
    
    while n != 0:
        if n%2:
            s += "1"
        else:
            s += "0"
            
        n //= 2
        
    arr = re.findall("1+",s)
    arr = list(map(lambda x : len(x), arr))
    print(max(arr))
