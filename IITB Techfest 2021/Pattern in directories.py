import re

n = int(input())
r = re.compile(input())
for i in range(n):
    s = input()
    if r.search(s):
        print("YES")
    else:
        print("NO")
