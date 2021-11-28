from sys import stdin, stdout
from re import search
input = stdin.readline
print = stdout.write

for case in range(1, int(input())+1):
    input()
    s = input()[:-1]
    arr = [["01", "2"], ["12","3"], ["23", "4"], ["34","5"], ["45","6"], ["56", "7"], ["67","8"], ["78", "9"], ["89","0"], ["90", "1"]]
    r = r"(01)|(12)|(23)|(34)|(45)|(56)|(67)|(78)|(89)|(90)"
    while(search(r, s)):
        for i in arr:
            s = s.replace(i[0], i[1])
    print("Case #{}: {}\n".format(case, s))
