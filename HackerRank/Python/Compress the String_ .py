# Enter your code here. Read input from STDIN. Print output to STDOUT
s = input()
arr = []
n = 0
c = s[0]

for i in s:
    if i == c:
        n += 1
    else:
        arr.append((n,int(c)))
        n = 1
        c = i

arr.append((n,int(c)))
print(*arr, sep=" ")
