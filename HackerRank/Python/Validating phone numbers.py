# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
r = re.compile("[789]\d{9}$")
for _ in range(int(input())):
    s = input()
    if bool(r.match(s)):
        print("YES")
    else:
        print("NO")
        
