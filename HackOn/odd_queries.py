def getFreq(arr):
    d = {}
    for i in arr:
        if i in d:
            d[i] ^= True
        else:
            d[i] = True
    return d

for case in range(int(input())):
    n = int(input())
    q = int(input())
    arr = list(map(int, input().split(" ")))
    queries = []
    for i in range(q):
        queries.append(list(map(int, input().split(" "))))

    for i in queries:
        opt = i[0]

        if opt == 1:
            index = i[1]-1
            val = i[2]
            arr[index] = val
        else:
            l = i[1]-1
            r = i[2]-1
            sub_arr = arr[l:r+1]
            #print(sub_arr)
            d = getFreq(sub_arr)
            #print(d)
            count = list(d.values()).count(True)
            #print(temp_arr, len(temp_arr))
            print(count, end = " ")
    print()
