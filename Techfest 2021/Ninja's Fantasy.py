def fantasyValue(A, n, m):
    arr = [0]*n
    for i in range(n):
        fan = 0
        for x in range(i):
            if(A[x] > A[i]) and ((A[x] - A[i])%m == 0):
                fan += A[x]
        arr[i] = fan%2
    return arr
