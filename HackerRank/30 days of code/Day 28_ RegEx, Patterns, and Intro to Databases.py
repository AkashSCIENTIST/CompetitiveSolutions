#!/bin/python3

import math
import os
import random
import re
import sys

arr = []

if __name__ == '__main__':
    N = int(input().strip())

    for N_itr in range(N):
        first_multiple_input = input().strip().split(" ")

        firstName = first_multiple_input[0]

        emailID = first_multiple_input[1]

        if emailID.endswith("@gmail.com"):
            if re.match("[a-z]{,20}", firstName):
                arr.append(firstName)
        
    arr.sort()
    print(*arr, sep="\n")
