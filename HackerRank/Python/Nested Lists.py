if __name__ == '__main__':
    d = {}
    val = 10**9
    for _ in range(int(input())):
        name = input()
        score = float(input())
        val = min(val, score)
        
        if score in d:
            d[score].append(name)
        else:
            d[score] = [name]
            
    l = list(d)
    l.remove(val)
    l = d[min(l)]
    l.sort()
    print(*l, sep="\n")
