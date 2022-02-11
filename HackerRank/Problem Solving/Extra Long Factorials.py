#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the extraLongFactorials function below.
def extraLongFactorials(n):
    f = n * fact(n-1)
    print(f)
    
def fact(n):
    if n > 1:
        return n * fact(n-1)
    else :
        return 1

if __name__ == '__main__':
    n = int(input())

    extraLongFactorials(n)
