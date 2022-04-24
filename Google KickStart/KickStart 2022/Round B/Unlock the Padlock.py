from itertools import groupby

for case in range(1, int(input())+1):
    n, d = map(int, input().split(" "))
    arr = list(map(int, input().split(" ")))
    #print(arr)
    temp = [k for k,g in groupby("".join([str(i) for i in arr]))]
    count = 0
    for i in temp:
        k = int(i)
        count += min(k, d-k)
    print("Case #{}: {}".format(case, count))
