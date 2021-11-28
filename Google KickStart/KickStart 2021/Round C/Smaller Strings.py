from sys import stdin, stdout
input = stdin.readline
print = stdout.write
s = ""


arr = []

def printAllKLengthRec(set_, prefix, n, k):
    if (k == 0):
        if (prefix < s) and (prefix == prefix[::-1]):
            arr.append(prefix)
        return

    for i in range(n):
        newPrefix = prefix + set_[i]
        printAllKLengthRec(set_, newPrefix, n, k - 1)
        
def printAllKLength(set_, k):
    n = len(set_)
    printAllKLengthRec(set_, "", n, k)

for case in range(1, int(input()) + 1):
    string = [chr(i) for i in range(ord('a'), ord('z')+1)]

    n,k = map(int, input().split())
    #global s
    s = input().strip()
    printAllKLength(string[:k], n)
    a = arr
    arr = []
    #fun = lambda x : (x == x[::-1])
    #fun1 = lambda x: x < s
    a.sort()
    #a = tuple(filter(fun, a))
    #a = tuple(filter(fun1, a))   
    nn = pow(len(a), 1, 1000000007)
    #print(" ".join(a))
    print("Case #{}: {}\n".format(case,nn))
    
