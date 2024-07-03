if __name__ == '__main__':
    n = int(input())
    arr = list(set(map(int, input().split())))
    arr.remove(max(arr))
    print(max(arr))
