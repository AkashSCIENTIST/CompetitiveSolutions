from itertools import permutations as per

def getMinSum(s):
    n = len(s)
    num = int(s)
    for i in range(1,n-1):
        a = int(s[:i])
        b = int(s[i:])
        c = a + b
        if c < num:
            num = c
    return num

for case in range(int(input())):
    s = input()
    all_s = ["".join(i) for i in list(per(s))]
    sums = [getMinSum(i) for i in all_s]
    print(min(sums))
