arr = []
for i in range(8):
    n = int(input())
    arr.append(n)

arr += arr[:3]

total = 0
for i in range(8):
    t = sum(arr[i:i+4])
    total = max(total, t)

print(total)
