from sys import stdin, stdout
print = stdout.write
input = stdin.readline

for i in range(1, int(input())+1):
    n = int(input())
    s = list(map(ord, list(input())))
    num = 1
    print("Case #{}: ".format(i))
    print(str(num))
    print(" ")
    for i in range(1,n):
        if s[i] > s[i-1]:
            num += 1
        else:
            num = 1
        print(str(num))
        print(" ")
    print("\n")
