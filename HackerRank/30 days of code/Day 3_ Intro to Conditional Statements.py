#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input().strip())
    if N%2 and N != 2:
        print("Weird")
    elif N in (2,3,4,5):
        print("Not Weird")
    elif N in range(6,21):
        print("Weird")
    else:
        print("Not Weird")
