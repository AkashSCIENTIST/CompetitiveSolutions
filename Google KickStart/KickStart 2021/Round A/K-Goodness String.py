for i in range(1, int(input())+1):
    n,k = tuple(map(int, input().split(" ")))
    temp = 0
    s = input()
    for j in range(len(s)//2):
        if s[j] != s[n-j-1]:
            temp += 1
    operations = temp - k
    print("Case #" + str(i) +": "+ str(abs(operations)))
