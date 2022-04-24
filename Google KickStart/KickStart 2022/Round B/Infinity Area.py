from math import pi
for case in range(1, int(input())+1):
    r,a,b = map(int, input().split(" "))
    l = [r, r*a]
    area = 0
    
    while True:
        temp = l[-1]//b
        if temp > 0:
            l.append(temp)
            l.append(temp * a)
        else:
            break
        
    for i in l:
        area += pi * i * i

    print("Case #{}: {}".format(case, round(area,6)))
