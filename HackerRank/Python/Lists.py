if __name__ == '__main__':
    N = int(input())
    arr = []
    for _ in range(N):
        s = input()
        l = s.split(" ")
        
        if l[0] == "print":
            print(arr)
        elif l[0] == "sort":
            arr.sort()
        elif l[0] == "append":
            arr.append(int(l[1]))
        elif l[0] == "reverse":
            arr.reverse()
        elif l[0] == "insert":
            arr.insert(int(l[1]), int(l[2]))
        elif l[0] == "pop":
            arr.pop()
        elif l[0] == "remove":
            arr.remove(int(l[1]))
