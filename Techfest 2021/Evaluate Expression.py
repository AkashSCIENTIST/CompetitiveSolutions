n = int(input())
total = 0
for i in range(n):
    s = input()
    p = int(s[-1])
    num = int(s[:-1])
    total += (num ** p)
print(total)
