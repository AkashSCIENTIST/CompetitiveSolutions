import re

for _ in range(int(input())):
    s = input()
    arr = re.findall(r"(\w)(\w+)\1", s)
    #print(arr)
    nums = [len(i[1]) for i in arr]
    print(max(nums))
