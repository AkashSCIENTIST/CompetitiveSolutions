# Enter your code here. Read input from STDIN. Print output to STDOUT
a,b = int(input()), int(input())
arr = divmod(a,b)
print(*arr, sep="\n")
print(arr)
