#!/bin/python3

import os
import sys

#
# Complete the timeConversion function below.
#
def timeConversion(s):
    #
    # Write your code here.
    #
    string = ""
    h = 0
    ss = s[-2] + s[-1]
    hour = int(s[0]  +s[1])
    if ss == "AM":
        if hour == 12:
            h = 0
        else:
            h = hour
    else:
        if hour == 12:
            h = hour
        else:
            h = hour + 12
        
    if h <= 9:
        string = "0"+str(h)
    else:
        string = str(h)
        
    string += s[2:8]
    return string

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    f.write(result + '\n')

    f.close()
