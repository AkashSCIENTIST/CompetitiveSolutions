from itertools import groupby
from sys import stdin, stdout
input = stdin.readline
print = stdout.write

def groups(l):
    return [sum(g) for i, g in groupby(l) if i == 1]

d = {
    "R" : set("R"),
    "B" : set("B"),
    "Y" : set("Y"),
    "U" : set(),
    "G" : set(("B","Y")),
    "O" : set(("R","Y")),
    "P" : set(("R","B")),
    "A" : set(("R","Y","B"))
    
}

for case in range(1, int(input())+1):
    input()
    s = list(input()[:-1])
    s = [d[i] for i in s]
    strokes = 0
    for i in "RGBYUGOPA":
        temp = []
        for j in s:
            if i in j:
                temp.append(1)
            else:
                temp.append(0)
        #print(temp)
        strokes += len(groups(temp))
    #print(strokes)
    print("Case #{}: {}\n".format(case, strokes))
