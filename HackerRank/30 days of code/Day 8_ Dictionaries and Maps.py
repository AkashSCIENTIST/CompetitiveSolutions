# Enter your code here. Read input from STDIN. Print output to STDOUTstrip()
n = int(input())
d = {}

for i in range(n):
    a,b = input().split(" ")
    d[a] = b
    
for i in range(n):
    try:
        s = input()
    except:
        break
    if s in d:
        print("{}={}".format(s,d[s]))
    else:
        print("Not found")
