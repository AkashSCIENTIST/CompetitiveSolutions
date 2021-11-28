from sys import stdin,stdout
input = stdin.readline
print = stdout.write

def fun(arr,pos):
    larr = (arr[:pos])[::-1]
    rarr = (arr[pos:])[1::]
    
    if ("1" in larr):
        if ("1" in rarr):
            lc = larr.index("1")
            rc = rarr.index("1")
            return min(lc,rc)+1
        else:
            lc = larr.index("1")
            return lc+1
        
    else:
        rc = rarr.index("1")
        return rc+1

for case in range(1,int(input())+1):
    n = int(input())
    s = input()
    count = 0
    
    for i in range(n):
        if s[i] == "1":
            count += 0
        else:
            count += fun(s,i)
            
    print("Case #{}: {}\n".format(case,count))
