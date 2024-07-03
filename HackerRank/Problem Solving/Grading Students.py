#!/bin/python3

import math
import os
import random
import re
import sys


def g(grades):
    # Write your code here
    mulof5 = [i for i in range(40,101) if i%5==0]
    
    if grades < 38:
        return grades
    elif grades in mulof5 :
        return grades
    elif int(grades + 1) in mulof5 :
        return (grades + 1)
    elif int(grades + 2) in mulof5 :
        return (grades + 2)
    else:
        return grades

    
def gradingStudents(y):
    x = [g(i) for i in y ]
    return x
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    grades_count = int(input().strip())

    grades = []

    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)

    result = gradingStudents(grades)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
