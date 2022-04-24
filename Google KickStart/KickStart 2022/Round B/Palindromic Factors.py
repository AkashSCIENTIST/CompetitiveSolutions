def factors(x):
    result = []
    i = 1
    while i*i <= x:
        if x % i == 0:
            result.append(i)
            if x//i != i:
                result.append(x//i)
        i += 1
    return result

for case in range(1, int(input())+1):
    n = int(input())
    l = list(map(str, factors(n)))
    fun = lambda x : x == x[::-1]
    filtered = tuple(filter(fun, l))
    print("Case #{}: {}".format(case, len(filtered)))
    
