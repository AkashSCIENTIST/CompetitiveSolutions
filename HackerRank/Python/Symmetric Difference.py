# Enter your code here. Read input from STDIN. Print output to STDOUT
input()
a = set(map(int, input().split(" ") ))
input()
b = set(map(int, input().split(" ") ))
c = list(a ^ b)
c.sort()
print(*c, sep="\n")
