# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
r = re.compile("^[+-]?\d*\.\d+$")
for i in range(int(input())):
    s = input()
    l = r.findall(s)
    #print(l)
    if l == []:
        print("False")
        continue
    elif l[0] == s:
        print("True")
    else:
        print("False")      
