if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    
    arr = [[a,b,c] for a in range(x+1) for b in range(y+1) for c in range(z+1)]
    arr = list(filter(lambda x: sum(x) != n, arr))
    print(arr)
