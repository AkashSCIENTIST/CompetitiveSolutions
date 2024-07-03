#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':

    arr = []
    max_ = -9 * 7

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    for i in range(6):
        for j in range(6):
            if ((i + 2 < 6) and (j + 2 < 6)):
                temp = arr[i][j] + arr[i + 2][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i][j + 2] + arr[i + 2][j + 2]
                if (temp > max_):
                    max_ = temp
                    
    print(max_)
